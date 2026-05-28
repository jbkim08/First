package chapter16;

class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <= 200; i++) {
            System.out.print(Thread.currentThread().getName() + ":" + i + "\t");
        }
    }
}
public class MyRunnableTest {
    static void main() {
        System.out.println("메인 스레드");
        Thread thread1 = new Thread(new MyRunnable());
        Thread thread2 = new Thread(new MyRunnable());

        thread1.start();
        thread2.start();

        System.out.println("메인 끝");
    }
}
