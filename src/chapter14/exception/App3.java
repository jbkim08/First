package chapter14.exception;


import java.util.Scanner;

public class App3 {
    static Scanner scanner = new Scanner(System.in); //키보드 입력 객체

    static void main() {
        int number = getNumber();
        System.out.println("입력한 숫자는 : " + number);
    }

    private static int getNumber() {
        int number = 0;
        boolean isNumber = false;

        do{
            System.out.print("숫자를 입력 : ");
            String line = scanner.nextLine(); // 한줄 입력받음

            try {
                number = Integer.parseInt(line); //문자열을 정수로
                isNumber = true;
            } catch (NumberFormatException e) {
                System.out.println("숫자 입력이 아닙니다.");
            }

        } while (!isNumber);

        return number;
    }
}
