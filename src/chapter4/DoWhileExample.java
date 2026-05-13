package chapter4;

public class DoWhileExample {
    static void main() {
        int num = 1;
        int sum = 0;

        do {
            sum += num; //총 합계 더함
            num++; //1씩 증가
        } while (num <= 10);

        System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
    }
}
