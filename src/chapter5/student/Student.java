package chapter5.student;

public class Student {
    //필드 또는 인스턴스 변수
    int studentId;      //학번
    String studentName; //학생이름
    int grade;          //학년
    String address;     //사는곳

    //학생의 이름을 가져오는 메서드 (인스턴스 메소드)
    public String getStudentName(){
        return studentName;
    }
    //기본 생성자 생략
}
