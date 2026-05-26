package chapter12.arrayList;

import java.util.ArrayList;

public class App {
    static void main() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(9);
        list.add(123);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
    }
}
