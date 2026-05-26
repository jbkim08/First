package chapter12.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    static void main() {
        ArrayList<Double> doubles = new ArrayList<>();
        doubles.add(7.38);
        doubles.add(3.88);
        doubles.add(1.45);
        doubles.add(2.35);
        doubles.add(9.28);

        Collections.sort(doubles);

        for (Double d : doubles){
            System.out.println(d);
        }
    }
}
