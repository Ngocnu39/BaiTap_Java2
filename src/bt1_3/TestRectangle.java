package bt1_3;

public class TestRectangle {
    public static void main(String[] args) {
        // Tạo đối tượng Rectangle với constructor tham số
        Rectangle r1 = new Rectangle(1.2f, 3.4f);
        System.out.println(r1);  // In ra thông tin của đối tượng r1

        // Tạo đối tượng Rectangle với constructor mặc định
        Rectangle r2 = new Rectangle();
        System.out.println(r2);  // In ra thông tin của đối tượng r2

        // Thử nghiệm với setters và getters
        r1.setLength(5.6f);
        r1.setWidth(7.8f);
        System.out.println(r1);  // In ra thông tin mới của đối tượng r1
        System.out.println("length is: " + r1.getLength());
        System.out.println("width is: " + r1.getWidth());

        // Tính diện tích và chu vi
        System.out.printf("area is: %.2f%n", r1.getArea());
        System.out.printf("perimeter is: %.2f%n", r1.getPerimeter());
    }
}
