package chapter7;

public class ArrayTest3 {
    static void main() {
        double[] data = new double[5]; //배열선언 5개
        int size = 0; //유효 요소 개수
        data[0] = 10.0; size++;
        data[1] = 20.0; size++;
        data[2] = 30.0; size++;

        for (int i = 0; i < size; i++) {
            System.out.println(data[i]);
        }
    }
}
