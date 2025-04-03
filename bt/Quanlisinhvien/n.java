package Quanlisinhvien;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentManagement {

    public static void addStudent(Student student) {
        String sql = "INSERT INTO student (studentid, name, class, email, gpa) VALUES (?, ?, ?, ?, ?);";
        try (Connection conn = Database.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, student.getId());
            stmt.setString(2, student.getName());
            stmt.setString(3, student.getClassName());
            stmt.setString(4, student.getEmail());
            stmt.setFloat(5, student.getGpa());
            stmt.executeUpdate();
            System.out.println("Thêm sinh viên thành công!");
        } catch (SQLException e) {
            System.err.println("Lỗi thêm sinh viên: " + e.getMessage());
        }
    }

    public static void getAllStudents() {
        String sql = "SELECT * FROM student;";
        try (Connection conn = Database.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("studentid") + ", Name: " + rs.getString("name") + ", Class: " + rs.getString("class") + ", Email: " + rs.getString("email") + ", GPA: " + rs.getFloat("gpa"));
            }
        } catch (SQLException e) {
            System.err.println("Lỗi lấy danh sách sinh viên: " + e.getMessage());
        }
    }

}
