package chapter16;

public class JoinTest extends Thread{
    int start;
    int end;
    int sum;

    public JoinTest(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run(){
        for (int i = start; i <= end; i++) {
            sum += i;
        }
    }

    static void main() throws InterruptedException {
        JoinTest joinA = new JoinTest(1,50);
        JoinTest joinB = new JoinTest(51,100);
        joinA.start();
        joinB.start();
        //메인스레드가 다른스레드를 기다림
        joinA.join();//메인이 joinA가 끝날때까지 대기
        joinB.join();//메인이 joinB가 끝날때까지 대기
        int total = joinA.sum + joinB.sum;
        System.out.println(joinA.sum + "+" + joinB.sum + "=" + total);
    }
}
