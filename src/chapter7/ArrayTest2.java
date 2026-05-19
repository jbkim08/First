package chapter7;

public class ArrayTest2 {
    static void main() {
        double[] data = new double[5]; //배열선언 5개
        data[0] = 10.0;
        data[1] = 20.0;
        data[2] = 30.0;

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }
}
