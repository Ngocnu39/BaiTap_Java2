package Quanlisinhvien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagement sm = new StudentManagement();

        // Menu chính
        while (true) {
            System.out.println("===== Quản lý sinh viên =====");
            System.out.println("1. Đăng nhập");
            System.out.println("2. Thêm sinh viên");
            System.out.println("3. Sửa sinh viên");
            System.out.println("4. Xóa sinh viên");
            System.out.println("5. Xem danh sách sinh viên");
            System.out.println("6. Đăng xuất");
            System.out.println("7. Thêm sinh viên vào lớp");
            System.out.println("8. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1: // Đăng nhập
                    System.out.print("Nhập email: ");
                    String email = scanner.nextLine();
                    sm.login(email);
                    break;
                case 2: // Thêm sinh viên
                    System.out.print("Nhập tên sinh viên: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhập lớp: ");
                    String className = scanner.nextLine();
                    System.out.print("Nhập email: ");
                    String newEmail = scanner.nextLine();
                    System.out.print("Nhập GPA: ");
                    float gpa = scanner.nextFloat();
                    sm.addStudent(new Student(0, name, className, newEmail, gpa));
                    break;
                case 3: // Sửa sinh viên
                    System.out.print("Nhập ID sinh viên cần sửa: ");
                    int idToEdit = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Nhập tên mới: ");
                    String newName = scanner.nextLine();
                    System.out.print("Nhập lớp mới: ");
                    String newClassName = scanner.nextLine();
                    System.out.print("Nhập email mới: ");
                    String newStudentEmail = scanner.nextLine();
                    System.out.print("Nhập GPA mới: ");
                    float newGpa = scanner.nextFloat();
                    sm.updateStudent(idToEdit, newName, newClassName, newStudentEmail, newGpa);
                    break;
                case 4: // Xóa sinh viên
                    System.out.print("Nhập ID sinh viên cần xóa: ");
                    int idToDelete = scanner.nextInt();
                    sm.deleteStudent(idToDelete);
                    break;
                case 5: // Xem danh sách sinh viên
                    sm.listStudents();
                    break;
                case 6: // Đăng xuất
                    sm.logout();
                    break;
                case 7: // Thêm sinh viên vào lớp
                    System.out.print("Nhập ID sinh viên: ");
                    int studentId = scanner.nextInt();
                    System.out.print("Nhập ID lớp: ");
                    int classId = scanner.nextInt();
                    sm.addStudentToClass(studentId, classId);
                    break;
                case 8: // Thoát
                    System.out.println("Thoát chương trình.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}
