package chapter12.arrayList;

import java.util.ArrayList;

public class Iterating {
    static void main() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(9);
        list.add(123);
        //향상된 for반복문
        for (Integer n :list){
            System.out.println(n);
        }
        System.out.println();
        //인덱스 번호가 필요할 경우
        for (int i = 0; i < list.size(); i++) {
            Integer n = list.get(i);
            System.out.println(i + ": " + n);
        }
        System.out.println();
        //배열의 forEach 메소드
        list.forEach(n->{
            System.out.println(n);
        });
    }
}
