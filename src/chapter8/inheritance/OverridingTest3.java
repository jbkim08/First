package chapter8.inheritance;

public class OverridingTest3 {

	static void main(String[] args) {
		
		int price = 10000;
		Customer customerLee = new Customer(10010, "이순신");
		System.out.println(customerLee.getCustomerName() +" 님이 지불해야 하는 금액은 " + customerLee.calcPrice(price) + "원입니다.");
		
		VIPCustomer customerKim = new VIPCustomer(10020, "김유신", 12345);
		System.out.println(customerKim.getCustomerName() +" 님이 지불해야 하는 금액은 " + customerKim.calcPrice(price) + "원입니다.");
		
		Customer vc = new VIPCustomer(10030, "나몰라", 2000);
		System.out.println(vc.getCustomerName() +" 님이 지불해야 하는 금액은 " + vc.calcPrice(10000) + "원입니다.");
		//오버라이딩 : 같은 메소드를 하위 클래스에서 덮어씀
		//오버로딩 : 이름만 같고 매개변수가 다른 메소드



	}
}
