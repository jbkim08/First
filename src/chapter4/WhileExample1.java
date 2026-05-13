package chapter4;

public class WhileExample1 {
    static void main() {
        int num = 1;
        int sum = 0;

        while (num <= 10) {
            sum += num; //총 합계 더함
            num++; //1씩 증가
        }
        System.out.println("1부터 10까지의 합은 " +  sum + "입니다.");
    }
}
