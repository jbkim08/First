package chapter6.staticex;

public class StudentTest1 {

	static void main(String[] args) {
		//인스턴스 객체와 상관없이 클래스로 참조됨
		Student studentLee = new Student();
		studentLee.setStudentName("이지원");
		System.out.println(Student.serialNum); //1000
		Student.serialNum++; //1001
		
		Student studentSon = new Student();
		studentSon.setStudentName("손수경");
		System.out.println(Student.serialNum); //1001
		System.out.println(Student.serialNum); //1001
	}
}

