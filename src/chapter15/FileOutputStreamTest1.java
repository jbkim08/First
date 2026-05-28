package chapter15;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {
    static void main() {
        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            fos.write(65);
            fos.write(66);
            fos.write(67);
        } catch (IOException e) {
            System.out.println("IO예외발생" + e.getMessage());
        }
        System.out.println("출력이 완료됨!");

    }
}
