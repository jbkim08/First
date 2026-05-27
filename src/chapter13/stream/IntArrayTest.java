package chapter13.stream;

import java.util.Arrays;

public class IntArrayTest {
    static void main() {
        int[] arr = {1,2,3,4,5};
        //배열을 스트림으로 생성
        int sumVal = Arrays.stream(arr).sum();
        int count = (int)Arrays.stream(arr).count();

        System.out.println(sumVal);
        System.out.println(count);
    }
}
