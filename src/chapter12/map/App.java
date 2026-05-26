package chapter12.map;

import java.util.HashMap;

public class App {
    static void main() {
        HashMap<Integer, String> people = new HashMap<>();
        people.put(0,"펭수");
        people.put(1,"길동");
        people.put(3,"라이언");
        people.put(4,"프레드");
        people.put(4,"마이클"); //키값이 같을경우 덮어쓰기
        people.put(10,"수지");

        System.out.println(people.get(4));

        String person = people.get(10);
        System.out.println(person);
        System.out.println(people);
        // 반복문 키집합, values 따로있음
        for(Integer k : people.keySet()){
            System.out.println(k); //키 값
            System.out.println(people.get(k)); //value 값
        }
    }
}
