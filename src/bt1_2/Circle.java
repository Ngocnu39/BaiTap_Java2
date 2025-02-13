package bt1_2;
public class Circle {
    private double radius;

    // Default constructor
    public Circle() {
        this.radius = 1.0;
    }

    // Constructor with parameter
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // toString() method
    @Override
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
}
