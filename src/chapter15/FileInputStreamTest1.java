package chapter15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest1 {
    static void main() {
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("input.txt");
            System.out.println(fis.read());
            System.out.println(fis.read());
            System.out.println(fis.read());
        } catch (FileNotFoundException e) {
            System.out.println("파일을 못찾음!");
        } catch (IOException e) {
            System.out.println("파일을 못읽음!");
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                System.out.println("파일닫기 예외!");
            } catch (NullPointerException e){
                System.out.println("객체가 Null 입니다.");
            }
        }
    }
}
