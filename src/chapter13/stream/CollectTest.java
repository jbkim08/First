package chapter13.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectTest {
    static void main() {
        List<Integer> numbers = Arrays.asList(5,-10,-22,0,43,7);

        List<Integer> pNumbers = numbers.stream()
                .filter(n -> n>0 )
                .collect(Collectors.toList()); //스트림을 다시 리스트로 변환
        System.out.println(pNumbers);
    }
}
