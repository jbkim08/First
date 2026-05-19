package chapter7;

public class TwoDimension {
    static void main() {
        int[][] arr = {{1,2,3}, {4,5,6}};
        //이차원배열은 중첩된 이중for문
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }
    }
}
