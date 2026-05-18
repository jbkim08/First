package chapter5.student;

public class StudentTest3 {
    static void main() {
        Student3 s1 = new Student3();
        s1.studentName = "홍길동";
        s1.studentId = 12345;
        s1.korean = new Subject("한국어", 90);
        s1.math = new Subject("수학", 100);


    }
}
