package bt;

import java.io.*;
import java.util.concurrent.*;

public class MultiThreadedKeywordSearch {
    private static final String KEYWORD = "example"; // Thay bằng từ khóa cần tìm
    private static final String[] FILES = {"file1.txt", "file2.txt", "file3.txt"};

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(FILES.length);
        ConcurrentHashMap<String, Integer> results = new ConcurrentHashMap<>();

        for (String file : FILES) {
            executor.execute(() -> results.put(file, searchInFile(file)));
        }

        executor.shutdown();
        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            System.err.println("Lỗi khi chờ luồng hoàn thành.");
        }

        results.forEach((file, count) ->
                System.out.println("Từ khóa xuất hiện " + count + " lần trong " + file));
    }

    private static int searchInFile(String fileName) {
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                count += line.split(KEYWORD, -1).length - 1;
            }
        } catch (IOException e) {
            System.err.println("Lỗi khi đọc file: " + fileName);
        }
        return count;
    }
}

