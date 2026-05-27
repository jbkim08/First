package chapter13.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceTest {
    static void main() {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        //모든 합구하기 (초기값 있는경우)
         int sum = numbers.stream()
                .reduce(100, (n1,n2) -> n1+n2 );
        System.out.println(sum);
    }
}
