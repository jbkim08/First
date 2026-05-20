package chapter11;

class Student{
    int studentId;
    String studentName;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    @Override
    public boolean equals(Object obj) {
        //입력한 객체가 스튜던트 객체이면
        if(obj instanceof Student std){
            return this.studentId == std.studentId; //같은 아이디일때 같은 학생구현
        }
        return false;
    }
    //학생의 해시코드를 학생id로 재정의
    @Override
    public int hashCode() {
        return studentId; //객체의 주소대신 학생의 아이디
    }
}

public class EqualTest {
    static void main() {
        Student studentLee = new Student(100, "이상원");
        Student studentLee2 = studentLee; //참조변수 대입시 주소값 복사
        Student studentLee3 = new Student(100, "이상원");

        boolean result = studentLee.equals(studentLee2);
        System.out.println(result);
        result = studentLee.equals(studentLee3);
        System.out.println(result);

        //문자열의 경우 자체적으로 문자열내용을 비교하는 equals 재정의됨
        String str1 = new String("abc");
        String str2 = new String("abc");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        //학생의 해시코드를 학생id로 재정의
        System.out.println("studentLee의 해시코드 : " + studentLee.hashCode());
        System.out.println("studentLee3의 해시코드 : " + studentLee3.hashCode());
        System.out.println("studentLee의 실제주소 : " + System.identityHashCode(studentLee));
        System.out.println("studentLee3의 실제주소 : " + System.identityHashCode(studentLee3));
    }
}
