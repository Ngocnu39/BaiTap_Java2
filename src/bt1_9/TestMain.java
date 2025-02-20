package bt1_9;

public class TestMain {
    public static void main(String[] args) {
        Ball ball = new Ball(50.0f, 30.0f, 10, 5.0f, 3.0f);
        System.out.println(ball);

        ball.move();
        System.out.println(ball);

        ball.reflectHorizontal();
        System.out.println(ball);

        ball.reflectVertical();
        System.out.println(ball);

        ball.setX(100.0f);
        ball.setY(50.0f);
        ball.setRadius(20);
        ball.setXDelta(-4.0f);
        ball.setYDelta(-2.0f);

        System.out.println("X: " + ball.getX());
        System.out.println("Y: " + ball.getY());
        System.out.println("Radius: " + ball.getRadius());
        System.out.println("X Delta: " + ball.getXDelta());
        System.out.println("Y Delta: " + ball.getYDelta());
    }
}

