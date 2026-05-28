package chapter15;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {
    static void main() {
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt"))) {
            int i;
            while ((i = isr.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println("예외발생" + e.getMessage());
        }
    }
}
