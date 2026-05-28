package chapter15;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    static void main() {
        try (FileReader fr = new FileReader("reader.txt")) {
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println("예외발생" + e.getMessage());
        }
    }
}
