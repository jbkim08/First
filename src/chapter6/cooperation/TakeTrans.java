package chapter6.cooperation;

public class TakeTrans {

	static void main(String[] args) {
		  //제임스 학생과 토마스를 생성
		  Student studentJames = new Student("James", 5000);   
		  Student studentTomas = new Student("Tomas", 10000);
		  //100번 버스 생성
		  Bus bus100 = new Bus(100);
		  studentJames.takeBus(bus100);
		  studentJames.showInfo();
		  bus100.showInfo();
		  //지하철 2호선 객체 생성
		  Subway subwayGreen = new Subway("2호선");
		  studentTomas.takeSubway(subwayGreen);
		  studentTomas.showInfo();
		  subwayGreen.showInfo();   
	}
}
