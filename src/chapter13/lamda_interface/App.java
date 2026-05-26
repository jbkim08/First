package chapter13.lamda_interface;

import java.util.function.Predicate;

public class App {
    static void main() {
        Predicate<String> p1 = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() < 4;
            }
        };
        System.out.println(p1.test("abcd"));
        System.out.println(p1.test("하나둘"));

        Predicate<String> p2 = s -> s.length() < 4;
        System.out.println(p2.test("abcd"));
        System.out.println(p2.test("하나둘"));

    }
}
