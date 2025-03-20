package bt;

import java.io.*;
import java.net.*;
import java.util.concurrent.*;

public class MultiThreadedDownloader {
    private static final String[] URLS = {
            "https://example.com/data1.json",
            "https://example.com/data2.json",
            "https://example.com/data3.json",
            "https://example.com/data4.json",
            "https://example.com/data5.json"
    };

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(URLS.length);

        for (int i = 0; i < URLS.length; i++) {
            final int index = i;
            executor.execute(() -> downloadContent(URLS[index], "output_" + (index + 1) + ".txt"));
        }

        executor.shutdown();
    }

    private static void downloadContent(String urlString, String fileName) {
        try (BufferedInputStream in = new BufferedInputStream(new URL(urlString).openStream());
             FileOutputStream fileOutputStream = new FileOutputStream(fileName)) {
            byte dataBuffer[] = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                fileOutputStream.write(dataBuffer, 0, bytesRead);
            }
            System.out.println("Đã tải xong: " + fileName);
        } catch (IOException e) {
            System.err.println("Lỗi khi tải từ: " + urlString);
        }
    }
}

