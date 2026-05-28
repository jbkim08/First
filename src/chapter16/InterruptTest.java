package chapter16;

public class InterruptTest extends Thread{
    public void run(){
        try {
            for (int i = 0; i < 10; i++) {
               Thread.sleep(3000); //3초 대기
                System.out.println(i + "\t");
            }
        } catch (InterruptedException e) {
            System.out.println("스레드 인터럽트!");
        }
        System.out.println("스레드 종료!");
    }

    static void main() throws InterruptedException {
        InterruptTest test = new InterruptTest();

        test.start();
        Thread.sleep(3000);
        test.interrupt(); //인터럽트
    }
}
