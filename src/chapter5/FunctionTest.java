package chapter5;

public class FunctionTest {
    static void main() {
        int num1 = 10;
        int num2 = 20;

        int sum = add(num1, num2);
        System.out.println(num1 + " + " + num2 + " = " + sum + "입니다.");
    }

    static int add(int num1, int num2) {
        return num1 + num2;
    }


}
