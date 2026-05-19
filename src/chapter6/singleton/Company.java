package chapter6.singleton;

public class Company {
	//미리 본인객체를 만들어 놓음.
	private static Company instance = new Company();
	//외부클래스에서는 생성하지 못함
	private Company(){}
	
	public static Company getInstance(){
		if(instance == null){
			instance = new Company();
		}
		return instance; // 위에서 이미만든 하나의 객체를 리턴
	}
}
