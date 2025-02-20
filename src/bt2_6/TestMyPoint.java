package bt2_6;

public class TestMyPoint {
    public static void main(String[] args) {
        // Test constructors and methods
        MyPoint p1 = new MyPoint();
        System.out.println(p1);  // (0, 0)

        p1.setX(8);
        p1.setY(6);
        System.out.println("x is: " + p1.getX());
        System.out.println("y is: " + p1.getY());

        p1.setXY(3, 0);
        System.out.println("getXY()[0]: " + p1.getXY()[0]);
        System.out.println("getXY()[1]: " + p1.getXY()[1]);
        System.out.println(p1);

        MyPoint p2 = new MyPoint(0, 4);
        System.out.println(p2);

        // Testing distance methods
        System.out.println("Distance p1 to p2: " + p1.distance(p2));
        System.out.println("Distance p2 to p1: " + p2.distance(p1));
        System.out.println("Distance p1 to (5,6): " + p1.distance(5, 6));
        System.out.println("Distance p1 to origin: " + p1.distance());

        // Create an array of 10 MyPoint instances
        MyPoint[] points = new MyPoint[10];
        for (int i = 0; i < points.length; i++) {
            points[i] = new MyPoint(i + 1, i + 1);
        }

        // Print all points
        for (MyPoint point : points) {
            System.out.println(point);
        }
    }
}

