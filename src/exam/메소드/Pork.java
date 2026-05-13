package exam.메소드;

public class Pork {
    static void main(String[] args) {
        /* 1. 변수를 생성하시오. 삼겹살 몇인분 변수 */
        int  n = 3;
        /* 2. 메소드를 통한 칼로리를 계산하시오. */
        double result = calorieCalculator(n);
        /* 3. 결과를 출력하시오 */
        System.out.printf("삼겹살 %d인분: %.2f kcal", n, result );
    }

    /* 4. 칼로리 계산을 위한 메소드를 작성하시오. */
    public static double calorieCalculator(int n) {
        return n * 180 * 5.179;
    }
}