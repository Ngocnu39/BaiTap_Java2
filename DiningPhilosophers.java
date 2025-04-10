public class DiningPhilosophers {
    private static class Philosopher implements Runnable {
        private final Object leftChopstick;
        private final Object rightChopstick;
        private final int id;

        public Philosopher(int id, Object leftChopstick, Object rightChopstick) {
            this.id = id;
            this.leftChopstick = leftChopstick;
            this.rightChopstick = rightChopstick;
        }

        private void think() throws InterruptedException {
            System.out.println("Triết gia " + id + " đang suy nghĩ");
            Thread.sleep((long) (Math.random() * 1000));
        }

        private void eat() throws InterruptedException {
            System.out.println("Triết gia " + id + " đang ăn");
            Thread.sleep((long) (Math.random() * 1000));
        }

        @Override
        public void run() {
            try {
                while (true) {
                    think();
                    
                    // Lấy đũa bên trái trước
                    synchronized (leftChopstick) {
                        System.out.println("Triết gia " + id + " đã lấy đũa trái");
                        
                        // Lấy đũa bên phải
                        synchronized (rightChopstick) {
                            System.out.println("Triết gia " + id + " đã lấy đũa phải");
                            eat();
                        }
                        System.out.println("Triết gia " + id + " đã đặt đũa phải xuống");
                    }
                    System.out.println("Triết gia " + id + " đã đặt đũa trái xuống");
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void main(String[] args) {
        // Tạo 5 đôi đũa
        Object[] chopsticks = new Object[5];
        for (int i = 0; i < chopsticks.length; i++) {
            chopsticks[i] = new Object();
        }

        // Tạo 5 triết gia
        Thread[] philosophers = new Thread[5];
        for (int i = 0; i < philosophers.length; i++) {
            Object leftChopstick = chopsticks[i];
            Object rightChopstick = chopsticks[(i + 1) % 5];
            
            // Triết gia cuối cùng sẽ lấy đũa theo thứ tự ngược lại để tránh deadlock
            if (i == philosophers.length - 1) {
                philosophers[i] = new Thread(new Philosopher(i, rightChopstick, leftChopstick));
            } else {
                philosophers[i] = new Thread(new Philosopher(i, leftChopstick, rightChopstick));
            }
            philosophers[i].start();
        }
    }
} 