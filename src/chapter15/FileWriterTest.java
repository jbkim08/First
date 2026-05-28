package chapter15;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    static void main() {
        try (FileWriter fw = new FileWriter("writer.txt")) {
            fw.write('A');
            char buf[] = {'B','C','D','E','F','G'};
            fw.write(buf);
            fw.write("안녕하세요. 잘 써지네요");
            fw.write(buf, 1, 2);
            fw.write("65");
        } catch (IOException e) {
            System.out.println("예외발생" + e.getMessage());
        }
    }
}
