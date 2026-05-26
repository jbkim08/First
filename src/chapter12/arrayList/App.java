package chapter12.arrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    static void main() {
        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(9);
        list.add(123);
        displayList(list);
    }
    //인터페이스 리스트가 매개변수
    private static void displayList(List<Integer> list){
        for (Integer n : list){
            System.out.println(n);
        }
    }
}
