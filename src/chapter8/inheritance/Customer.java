package chapter8.inheritance;

public class Customer {
	//같은 패키지 또는 상속시 protected 사용가능
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	/*public Customer()
	{
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		System.out.println("Cusomer() 생성자 호출");
	}*/
	
	public Customer(int customerID, String customerName){
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER"; //고객의 첫등급 실버
		bonusRatio = 0.01;		  //포인트적립 1%
		System.out.println("Cusomer(int, String) 생성자 호출");
	}
	//가격을 입력하면 보너스가 쌓임
	public int calcPrice(int price){
		bonusPoint += price * bonusRatio; //보너스
		return price;
	}
	//고객 정보 출력
	public String showCustomerInfo(){
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
	}

	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

}
