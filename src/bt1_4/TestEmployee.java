package bt1_4;

public class TestEmployee {
    public static void main(String[] args) {
        // Khởi tạo nhân viên
        Employee e1 = new Employee(8, "Peter", "Tan", 2500);
        System.out.println(e1);  // In thông tin nhân viên

        // Thay đổi lương trực tiếp
        e1.setSalary(999); // Đặt lương thành 999
        System.out.println(e1);  // In lại thông tin nhân viên

        // In thông tin chi tiết
        System.out.println("id is: " + e1.getId());
        System.out.println("firstname is: " + e1.getFirstName());
        System.out.println("lastname is: " + e1.getLastName());

        System.out.println("salary is: " + e1.getSalary());
        System.out.println("name is: " + e1.getFirstName() + " " + e1.getLastName());

        System.out.printf("annual salary is: %.2f%n", e1.getAnnualSalary()); // In lương hàng năm

        // Cập nhật lương thêm
        e1.setSalary(1098); // Đặt lương thành 1098
        System.out.println(e1);  // In thông tin nhân viên
    }
}
