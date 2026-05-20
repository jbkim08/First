package chapter11;

public class StringTest2 {
    static void main() {
        String javaStr = "java";
        String android = "android";
        System.out.println(javaStr);
        System.out.println("처음 문자열 주소값 : " + System.identityHashCode(javaStr));
        javaStr = javaStr.concat(android);
        System.out.println(javaStr);
        System.out.println("합친후 문자열 주소값 : " + System.identityHashCode(javaStr));
    }
}
