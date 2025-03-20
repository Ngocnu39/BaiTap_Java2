package bt;

import java.io.*;
import java.util.concurrent.*;

public class MultiThreadedFileReader {
    private static final int CHUNK_SIZE = 1024 * 1024; // 1MB
    private static final String INPUT_FILE = "large_file.txt";
    private static final String OUTPUT_FILE = "output.txt";

    public static void main(String[] args) {
        File file = new File(INPUT_FILE);
        long fileSize = file.length();
        int numChunks = (int) Math.ceil((double) fileSize / CHUNK_SIZE);

        ExecutorService executor = Executors.newFixedThreadPool(numChunks);
        byte[][] fileChunks = new byte[numChunks][];

        for (int i = 0; i < numChunks; i++) {
            final int chunkIndex = i;
            executor.execute(() -> fileChunks[chunkIndex] = readChunk(chunkIndex));
        }

        executor.shutdown();
        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            System.err.println("Lỗi khi chờ luồng hoàn thành.");
        }

        mergeChunks(fileChunks);
    }

    private static byte[] readChunk(int chunkIndex) {
        try (RandomAccessFile raf = new RandomAccessFile(INPUT_FILE, "r")) {
            raf.seek((long) chunkIndex * CHUNK_SIZE);
            int remaining = (int) Math.min(CHUNK_SIZE, raf.length() - raf.getFilePointer());
            byte[] buffer = new byte[remaining];
            raf.readFully(buffer);
            return buffer;
        } catch (IOException e) {
            System.err.println("Lỗi đọc chunk " + chunkIndex);
            return new byte[0];
        }
    }

    private static void mergeChunks(byte[][] fileChunks) {
        try (FileOutputStream fos = new FileOutputStream(OUTPUT_FILE)) {
            for (byte[] chunk : fileChunks) {
                fos.write(chunk);
            }
        } catch (IOException e) {
            System.err.println("Lỗi khi ghi file.");
        }
    }
}

