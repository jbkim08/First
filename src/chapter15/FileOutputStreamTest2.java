package chapter15;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {
    static void main() {
        try (FileOutputStream fos = new FileOutputStream("output2.txt")) {
            byte[] bs = new byte[26];
            byte data = 65; //대문자 A
            for (int i = 0; i < bs.length; i++) {
                bs[i] = data;
                data++;
            }
            fos.write(bs); //배열 단위로 쓰기
        } catch (IOException e) {
            System.out.println("IO예외발생" + e.getMessage());
        }
        System.out.println("출력이 완료됨!");

    }
}
