package chapter12.arrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Timing {
    static void main() {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        long duration = timeOperations(arrayList);

        System.out.println("측정시간 : " + duration);
    }

    private static long timeOperations(List<Integer> list) {
        long start = System.currentTimeMillis(); //현재시간 1/1000초
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }
        //반복문 작업이 끝난후 끝난시간에서 처음시간 빼기 => 걸린시간
        return System.currentTimeMillis() - start;
    }
}
