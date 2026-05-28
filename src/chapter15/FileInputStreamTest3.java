package chapter15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest3 {
    static void main() {
        try (FileInputStream fis = new FileInputStream("input2.txt")) {
            byte[] bs = new byte[10]; //10바이트 배열
            int i;
            while ((i = fis.read(bs)) != -1) {
                for (byte b : bs) {
                    System.out.print((char) b);
                }
                System.out.println(": " + i + "바이트 읽음");
            }
        } catch (FileNotFoundException e) {
            System.out.println("파일 못찾음");
        } catch (IOException e) {
            System.out.println("파일 못읽음");
        }

    }
}
