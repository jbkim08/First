package chapter15;

import java.io.*;

public class BufferedStreamTest {
    static void main() {
        long millisecond = 0;
        try (FileInputStream fis = new FileInputStream("a.zip");
             FileOutputStream fos = new FileOutputStream("copy.zip");
             BufferedInputStream bis = new BufferedInputStream(fis);
             BufferedOutputStream bos = new BufferedOutputStream(fos)
        ) {
            millisecond = System.currentTimeMillis();
            int i;
            while ((i=bis.read()) != -1){
                bos.write(i);
            }
            millisecond = System.currentTimeMillis() - millisecond;
        } catch (IOException e) {
            System.out.println("예외발생" + e.getMessage());
        }
        System.out.println("파일 복사하는데 " + millisecond + "millisecond 소요되었습니다.");
    }
}
