package Quanlisinhvien;

public class Class {
    private int classId;
    private String description;
    private int numberOfCredits;

    public Class() {
        this(0, "Chưa có mô tả", 0);
    }

    public Class(int classId, String description, int numberOfCredits) {
        this.classId = classId;
        this.description = description;
        this.numberOfCredits = numberOfCredits;
    }

    public int getClassId() { return classId; }
    public String getDescription() { return description; }
    public int getNumberOfCredits() { return numberOfCredits; }

    public void setClassId(int classId) { this.classId = classId; }
    public void setDescription(String description) { this.description = description; }
    public void setNumberOfCredits(int numberOfCredits) { this.numberOfCredits = numberOfCredits; }

    @Override
    public String toString() {
        return "Class ID: " + classId + ", Description: " + description + ", Credits: " + numberOfCredits;
    }
}
