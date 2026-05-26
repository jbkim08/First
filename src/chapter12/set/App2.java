package chapter12.set;

import java.util.HashSet;
import java.util.TreeSet;

public class App2 {
    static void main() {
        //트리셋은 정렬됨.
        TreeSet<String> fruits = new TreeSet<>();
        fruits.add("사과");
        fruits.add("바나나");
        fruits.add("오렌지");
        fruits.add("오렌지");
        fruits.add("배");
        fruits.add("사과");
        fruits.add("사과");
        System.out.println(fruits.contains("오렌지")); //리스트에 있는지 확인
        for(String s : fruits){
            System.out.println(s);
        }
    }
}
