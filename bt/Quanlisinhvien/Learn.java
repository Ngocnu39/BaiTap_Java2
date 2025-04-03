package Quanlisinhvien;

public class Learn {
    private int learnId;
    private int studentId;
    private int classId;

    public Learn() {
        this(0, 0, 0);
    }

    public Learn(int learnId, int studentId, int classId) {
        this.learnId = learnId;
        this.studentId = studentId;
        this.classId = classId;
    }

    public int getLearnId() { return learnId; }
    public int getStudentId() { return studentId; }
    public int getClassId() { return classId; }

    public void setLearnId(int learnId) { this.learnId = learnId; }
    public void setStudentId(int studentId) { this.studentId = studentId; }
    public void setClassId(int classId) { this.classId = classId; }

    @Override
    public String toString() {
        return "Learn ID: " + learnId + ", Student ID: " + studentId + ", Class ID: " + classId;
    }
}

