package bt;

import java.io.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class FileProcessor {
    private static final String[] INPUT_FILES = {
            "output_1.txt",
            "output_2.txt",
            "output_3.txt",
            "output_4.txt",
            "output_5.txt"
    };
    private static final String OUTPUT_FILE = "merged_output.txt";

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(INPUT_FILES.length);

        for (String file : INPUT_FILES) {
            executor.execute(() -> processFile(file));
        }

        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.MINUTES);
            mergeFiles();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void processFile(String fileName) {
        File inputFile = new File(fileName);
        File tempFile = new File("cleaned_" + fileName);

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String cleanedLine = removeHtmlTags(line);
                writer.write(cleanedLine);
                writer.newLine();
            }

            System.out.println("Xử lý xong file: " + fileName);
        } catch (IOException e) {
            System.err.println("Lỗi xử lý file: " + fileName);
        }
    }

    private static String removeHtmlTags(String text) {
        return text.replaceAll("<[^>]*>", ""); // Xóa thẻ HTML
    }

    private static void mergeFiles() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(OUTPUT_FILE))) {
            for (String file : INPUT_FILES) {
                File cleanedFile = new File("cleaned_" + file);
                try (BufferedReader reader = new BufferedReader(new FileReader(cleanedFile))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        writer.write(line);
                        writer.newLine();
                    }
                }
            }
            System.out.println("Gộp file hoàn tất: " + OUTPUT_FILE);
        } catch (IOException e) {
            System.err.println("Lỗi khi gộp file.");
        }
    }
}

