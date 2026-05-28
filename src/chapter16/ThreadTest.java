package chapter16;

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 200; i++) {
            System.out.print(Thread.currentThread().getName() + ":" + i + "\t");
        }
    }
}

public class ThreadTest {
    static void main() {
        System.out.println(Thread.currentThread());

        MyThread thread1 = new MyThread(); //thread1 생성
        thread1.start(); //스레스 시작 run메소드 실행

        MyThread thread2 = new MyThread(); //thread1 생성
        thread2.start(); //스레스 시작 run메소드 실행

        System.out.println("end");
    }
}
