package chapter14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling1 {
    static void main() {
        try {
            FileInputStream fis = new FileInputStream("a.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e); //예외 클래스의 toString 호출
        } finally {
            System.out.println("예외 상관없이 항상 실행");
        }
        System.out.println("여기서도 정상 출력됨!");
    }
}
