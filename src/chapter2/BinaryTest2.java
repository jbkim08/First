package chapter2;

public class BinaryTest2 {
    static void main() {
        //인트 정수(4바이트=32비트)
        int num1 = 0B00000000000000000000000000000101; //5
        int num2 = 0B11111111111111111111111111111011; //-5
        int sum = num1 + num2;
        int a = 'a';
        //int b = "b";
        long l1 = 11111111111111L; //long 타입 숫자에 L 붙임
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(sum);
    }
}
