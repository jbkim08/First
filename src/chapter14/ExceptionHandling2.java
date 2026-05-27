package chapter14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling2 {
    static void main() {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("a.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e); //예외 클래스의 toString 호출
            return; // 예외발생시 종료
        } finally {
            if(fis != null){
                try {
                    fis.close(); //파일 닫을때도 예외처리
                } catch (IOException e) {
                    e.printStackTrace(); //예외발생 위치 찾기
                }
            }
            System.out.println("항상 수행됩니다.");
        }
        System.out.println("여기서도 정상 출력됨!");
    }
}
