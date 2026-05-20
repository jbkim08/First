package chapter11;

public class StringTest1 {
    static void main() {
        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1 == str2); //객체주소가 비교됨
        System.out.println(str1.equals(str2)); //문자열을 비교

        String str3 = "abc";
        String str4 = "abc";

        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));
    }
}
