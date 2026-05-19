package chapter6.staticex;

public class Student1 {
	
	public static int serialNum = 1000;
	int studentID;
	String studentName;
	int grade;
	String address;

	public Student1(){
		serialNum++; // 생성자에 시리얼 넘버를 1증가
		studentID = serialNum; //학생ID에 입력
	}
	
	public String getStudentName(){
		return studentName;
	}
	
	public void setStudentName(String name){
		studentName = name;
	}
	//스테틱 메소드에서 사용하는 변수는 무조건 스테틱 변수가 되어야함.
	public static int getSerialNum() {
		int i = 10;
	//	studentName = "aaa";
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student1.serialNum = serialNum;
	}
}
