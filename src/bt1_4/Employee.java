package bt1_4;

public class Employee {
    private int id;           // ID của nhân viên
    private String firstName; // Tên
    private String lastName;  // Họ
    private double salary;     // Lương

    // Constructor
    public Employee(int id, String firstName, String lastName, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    // Getter cho ID
    public int getId() {
        return id;
    }

    // Getter cho tên
    public String getFirstName() {
        return firstName;
    }

    // Getter cho họ
    public String getLastName() {
        return lastName;
    }

    // Getter cho lương
    public double getSalary() {
        return salary;
    }

    // Phương thức tăng lương
    public void setSalary(double salary) {
        this.salary = salary; // Cập nhật lương trực tiếp
    }

    // Tính lương hàng năm
    public double getAnnualSalary() {
        return salary * 12; // Lương hàng năm = lương tháng * 12
    }

    // Phương thức toString để in thông tin nhân viên
    @Override
    public String toString() {
        return "Employee[id=" + id + ",name=" + firstName + " " + lastName + ",salary=" + salary + "]";
    }
}
