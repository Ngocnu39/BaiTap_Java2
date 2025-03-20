package bt;

import java.io.*;

public class DataStreamExample {
    public static void main(String[] args) {
        String fileName = "numbers.dat";
        int[] numbers = {10, 20, 30, 40, 50};

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            for (int num : numbers) {
                dos.writeInt(num);
            }
            System.out.println("Ghi dữ liệu vào file thành công.");
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi file: " + e.getMessage());
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            System.out.println("Dữ liệu đọc từ file:");
            while (dis.available() > 0) {
                System.out.println(dis.readInt());
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc file: " + e.getMessage());
        }
    }
}

