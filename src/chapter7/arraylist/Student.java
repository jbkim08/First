package chapter7.arraylist;

import java.util.ArrayList;

public class Student {
	
	int studentID;
	String studentName;
	ArrayList<Subject> subjectList; //과목 리스트

	//생성자
	public Student(int studentID, String studentName){
		this.studentID = studentID;
		this.studentName = studentName;
		// 리스트 생성
		subjectList = new ArrayList<Subject>();
	}
	// 과목을 리스트에 추가
	public void addSubject(String name, int score){
		Subject subject = new Subject();
		// 새 과목을 생성해서 이름/점수 입력
		subject.setName(name);
		subject.setScorePoint(score);
		subjectList.add(subject); //리스트에 추가
	}

	//학생의 이름과 과목별 성적 , 총점 출력
	public void showStudentInfo()
	{
		int total = 0;
		
		for(Subject s : subjectList){
			
			total += s.getScorePoint();
			System.out.println("학생 " + studentName + "의 " + s.getName( ) + " 과목 성적은 " + s.getScorePoint( ) + "입니다.");
		}
			
		System.out.println("학생 " + studentName + "의 총점은 " + total + "입니다.");
	}
}
