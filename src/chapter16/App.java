package chapter16;

public class App {
    private int value = 0;
    //스레드에서 순차적으로 접근함.
    private synchronized void increment() {
        value++;
    }
    public void run() throws InterruptedException {
        Runnable runnable = () -> {
            for (int i = 0; i < 10000; i++) {
                increment();
            }
        };

        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        Thread t3 = new Thread(runnable);

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("Value: " + value);
    }

    static void main() throws InterruptedException {
        new App().run();
    }
}
