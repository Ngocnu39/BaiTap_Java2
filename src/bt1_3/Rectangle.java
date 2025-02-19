package bt1_3;

public class Rectangle {
    private float length; // Chiều dài
    private float width;  // Chiều rộng

    // Constructor mặc định
    public Rectangle() {
        this.length = 1.0f; // Giá trị mặc định
        this.width = 1.0f;  // Giá trị mặc định
    }

    // Constructor với tham số
    public Rectangle(float length, float width) {
        setLength(length);
        setWidth(width);
    }

    // Getter và Setter cho length
    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        if (length < 0) {
            throw new IllegalArgumentException("Length cannot be negative.");
        }
        this.length = length;
    }

    // Getter và Setter cho width
    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        if (width < 0) {
            throw new IllegalArgumentException("Width cannot be negative.");
        }
        this.width = width;
    }

    // Tính diện tích
    public float getArea() {
        return length * width; // Diện tích = chiều dài * chiều rộng
    }

    // Tính chu vi
    public float getPerimeter() {
        return 2 * (length + width); // Chu vi = 2 * (chiều dài + chiều rộng)
    }

    // Phương thức toString
    @Override
    public String toString() {
        return "Rectangle[length=" + length + ",width=" + width + "]";
    }
}
