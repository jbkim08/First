package chapter13.lamda_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class RemoveIf {
    static void main() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);
        numbers.add(2);
        numbers.add(9);
        numbers.add(10);
        numbers.add(4);

        numbers.removeIf(n -> n < 6);

        numbers.forEach(x-> System.out.println(x));

    }
}
