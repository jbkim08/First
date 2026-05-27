package chapter13.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FilterTest {
    static void main() {
        List<Integer> numbers = Arrays.asList(5,-10,-22,0,43,7); //배열식을 리스트로
        //리스트는 바로 스트림으로 변경가능
        Stream<Integer> s = numbers.stream().filter(n->n>0);
        s.forEach(n-> System.out.println(n));
    }
}
