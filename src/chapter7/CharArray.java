package chapter7;

public class CharArray {
    static void main() {
        char[] alphabets = new char[26];
        char ch = 'A';
        for (int i = 0; i < alphabets.length; i++, ch++) {
            alphabets[i] = ch; //아스키코드 값으로 영문자 넣기
        }
        for (int i = 0; i < alphabets.length; i++) {
            System.out.println(alphabets[i]+","+(int)alphabets[i]);
        }
    }
}
