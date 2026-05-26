package chapter12.set;

import java.util.HashSet;

public class App {
    static void main() {
        //셋타입 리스트
        HashSet<String> fruits = new HashSet<>();
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
