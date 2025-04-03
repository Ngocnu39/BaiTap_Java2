package Quanlisinhvien;

public class Student {
    private int id;
    private String name;
    private int age;
    private String email;
    private float gpa;

    public Student() {
        this(0, "Chưa có tên", 18, "unknown@example.com", 0.0f);
    }

    public Student(int id, String name) {
        this(id, name, 18, "unknown@example.com", 0.0f);
    }

    public Student(int id, String name, int age, String email, float gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.gpa = gpa;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getEmail() { return email; }
    public float getGpa() { return gpa; }

    public boolean isFirstYearStudent() {
        return age <= 19;
    }

    public float getGpaWithBonus() {
        float bonus = 0.0f;
        if (age < 20) bonus = 0.1f;
        if (gpa >= 3.5) bonus += 0.2f;
        return Math.min(4.0f, gpa + bonus);
    }

    public boolean isSchoolEmail() {
        return email.toLowerCase().endsWith(".edu") ||
                email.toLowerCase().endsWith(".edu.vn");
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Email: " + email + ", GPA: " + gpa;
    }

    public String getClassName() {
        return "";
    }
}
