package chapter6.staticex;

public class StudentTest2 {

	static void main(String[] args) {

		Student1 studentLee = new Student1();
		studentLee.setStudentName("이지원");
		System.out.println(Student1.serialNum);
		System.out.println(studentLee.studentName + " 학번:"
		                        + studentLee.studentID);
		//서로 다른 객체가 시리얼넘버(스테틱변수)를 공유해서 사용
		Student1 studentSon = new Student1();
		studentSon.setStudentName("손수경");
		System.out.println(Student1.serialNum);
		System.out.println(studentSon.studentName + " 학번:"
		                        + studentSon.studentID);
	}
}

