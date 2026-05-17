package exam.배열과반복문;

public class Local {
    static void main(String[] args) {
        // 배열 생성
        String[] cities = {"서울", "부산", "인천", "대전", "대구"};
        int[] visitors = {599, 51, 46, 43, 27};

        for (int i = 0; i < cities.length; i++) {
            /* 3. 결과를 출력 하시오. */
            System.out.printf("%s: %d명 \n", cities[i], visitors[i]);
        }
    }
}
