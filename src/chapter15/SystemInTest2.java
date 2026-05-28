package chapter15;

import java.io.IOException;

public class SystemInTest2 {
    static void main() {
        System.out.println("알파벳을 여러 개를 쓰고 [Enter]를 누르세요");

        int i;
        try {
            //엔터키를 누르면 입력된 문자를 하나씩 읽어서 '\n' 앞까지만 출력
            while ((i=System.in.read()) != '\n'){
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
