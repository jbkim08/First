package chapter7;

public class EnhancedForLoop {
    static void main() {
        String[] strArray = {"Java", "Android", "C", "JavaScript", "Python"};
        // 향상된 for문 : 간단하다. 인덱스가 없음.
        for (String l : strArray ){
            System.out.println(l);
        }

    }
}
