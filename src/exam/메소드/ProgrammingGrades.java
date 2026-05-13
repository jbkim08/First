package exam.메소드;

public class ProgrammingGrades {
    static void main(String[] args) {
        // 변수 생성
        int score1 = 96;
        int score2 = 85;
        int score3 = 76;

        // 결과 출력
        System.out.printf("%d점 -> %s\n", score1, grade(score1));
        System.out.printf("%d점 -> %s\n", score2, grade(score2));
        System.out.printf("%d점 -> %s\n", score3, grade(score3));
    }

    public static String grade(int score) {
        /* 메소드를 완성하시오. */
        String result = "";
        if (score >= 95) {
            result = "A+";
        } else if (score >= 90) {
            result = "A0";
        } else if (score >= 80) {
            result = "B+";
        } else if (score >= 70) {
            result = "B0";
        } else {
            result = "C+";
        }
        return result;
    }
}