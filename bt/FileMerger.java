package bt;

import java.io.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FileMerger {
    private static final String OUTPUT_FILE = "output.txt";
    private static final Object lock = new Object();

    public static void main(String[] args) {
        File folder = new File("path_to_directory");
        File[] files = folder.listFiles((dir, name) -> name.endsWith(".txt"));

        if (files == null) {
            System.out.println("Không tìm thấy file.");
            return;
        }

        ExecutorService executor = Executors.newFixedThreadPool(files.length);

        for (File file : files) {
            executor.execute(() -> readFileAndWriteToOutput(file));
        }

        executor.shutdown();
    }

    private static void readFileAndWriteToOutput(File file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file));
             BufferedWriter writer = new BufferedWriter(new FileWriter(OUTPUT_FILE, true))) {
            String line;
            synchronized (lock) {
                while ((line = reader.readLine()) != null) {
                    writer.write(line);
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            System.out.println("Lỗi xử lý file: " + file.getName());
        }
    }
}

