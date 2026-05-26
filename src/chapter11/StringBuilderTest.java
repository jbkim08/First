package chapter11;

public class StringBuilderTest {
    static void main() {
        String javaStr = new String("Java");
        System.out.println("javaStr 주소 : " + System.identityHashCode(javaStr));
        //스트링빌더 객체 buffer 생성(초기값 "Java")
        StringBuilder buffer = new StringBuilder(javaStr);
        System.out.println("처음 buffer 주소 : " + System.identityHashCode(buffer));
        buffer.append(" and");
        buffer.append(" android");
        buffer.append(" programming is fun!!");
        System.out.println("붙힌후 buffer 주소 : " + System.identityHashCode(buffer));

        javaStr = buffer.toString();
        System.out.println(javaStr);
        System.out.println("javaStr 주소 : " + System.identityHashCode(javaStr));
    }
}
