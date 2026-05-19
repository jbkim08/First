package chapter8.inheritance;

public class VIPCustomer extends Customer{
	//모든 고객의 필드와 메서드를 상속받고 추가로
	private final int agentID;
	double saleRatio;

	public VIPCustomer(int customerID, String customerName, int agentID){
		super(customerID, customerName); // 상속부모의 생성자
		customerGrade = "VIP";  //덮어씀
		bonusRatio = 0.05; 		//5%
		saleRatio = 0.1;
		this.agentID = agentID;
		System.out.println("VIPCusomer(int, String) 생성자 호출");
	}
	// vip 고객은 가격계산시 할인받음.
//	public int calcPrice(int price){
//		bonusPoint += price * bonusRatio;
//		return price - (int)(price * saleRatio);
//	}
	//같은 메소드를 자식클래스에서 재정의
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}

	public int getAgentID(){
		return agentID;
	}
	
	
}
