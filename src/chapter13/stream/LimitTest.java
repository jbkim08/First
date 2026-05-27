package chapter13.stream;

import java.util.Arrays;
import java.util.List;

public class LimitTest {
    static void main() {
        //문자열리스트 배열을 이용
        List<String> fruits = Arrays.asList("파인애플","사과","바나나","귤");
        System.out.println("기본정렬 (오름차순 정렬): ");
        fruits.stream()
                .sorted()
                .limit(2)
                .forEach(s -> System.out.print(s + " "));
        System.out.println();
        System.out.println("맞춤형 정렬 (문자열 길이에 따라): ");
        fruits.stream()
                .sorted((o1, o2) -> Integer.compare(o1.length(), o2.length()))
                .limit(2)
                .forEach(s -> System.out.print(s + " "));
    }
}
