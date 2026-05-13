package chapter2;

public class DoubleEx2 {
    static void main() {
        double dnum = 1;

        for (int i = 0; i < 10000; i++) {
            dnum = dnum + 0.1;
        }
        System.out.println(dnum);

    }
}
