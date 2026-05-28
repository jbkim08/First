package chapter14.exception;


import java.util.Scanner;

public class App2 {
    static void main() {
        Scanner scanner = new Scanner(System.in); //키보드 입력 객체
        System.out.println("숫자를 입력 : ");
        String line = scanner.nextLine(); // 한줄 입력받음
        int number = 0;

        try {
            number = Integer.parseInt(line); //문자열을 정수로
        } catch (NumberFormatException e) {
            System.out.println("숫자 입력이 아닙니다.");
        }
        System.out.println("입력한 숫자는 : " + number);

        scanner.close();
    }
}
