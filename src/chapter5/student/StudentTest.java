package chapter5.student;

public class StudentTest {
    static void main() {
        int n1 = 77;
        char c1 = 'A';
        boolean b1 = true;
        String s = "1234";
        Student s1 = new Student(); // 첫번째 학생 객체
        s1.studentName = "홍길동";
        System.out.println(s1.studentName);
        System.out.println(s1); //참조변수의 주소가 출력
        Student s2 = new Student(); // 두번째 학생 객체
        s2.studentName = "이순신";
        System.out.println(s2.getStudentName());
        System.out.println(s2); //참조변수의 주소가 출력


    }
}
