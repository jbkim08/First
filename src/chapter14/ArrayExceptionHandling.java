package chapter14;

public class ArrayExceptionHandling {
    static void main() {
        int[] arr = new int[5]; // 정수 5칸 배열

        try {
            for (int i = 0; i <= arr.length; i++) {
                arr[i] = i;
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System.out.println("배열 인덱스 범위 초과 예외처리");
        }

        System.out.println("프로그램 정상 종료");
    }
}
