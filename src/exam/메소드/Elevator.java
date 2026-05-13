package exam.메소드;

public class Elevator {
    static void main(String[] args) {
        // 변수 생성
        int a = 13;
        int b = 7;
        int c = 10;

        // 결과 출력
        System.out.printf("%d층 -> %s 엘레베이터\n", a, guide(a));
        System.out.printf("%d층 -> %s 엘레베이터\n", b, guide(b));
        System.out.printf("%d층 -> %s 엘레베이터\n", c, guide(c));
    }

    public static  String  guide(int n) {
        /* 메소드를 완성하시오. */
        String result = "";
        if(n>=1 && n<=10){
            result = "저층 엘레베이터";
        } else if (n>10 && n<=20) {
            result = "고층 엘레베이터";
        } else {
            result = "잘못된 층수입니다.";
        }
        return result;
    }
}
