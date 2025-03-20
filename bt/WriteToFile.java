package bt;

import java.io.*;

public class WriteToFile {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Nhập nội dung để ghi vào file (nhập 'exit' để dừng):");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if ("exit".equalsIgnoreCase(line)) {
                    break;
                }
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Ghi file thành công! Dữ liệu được lưu vào output.txt.");
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi file: " + e.getMessage());
        }
    }
}

