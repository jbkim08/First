package chapter8.inheritance;

public class CustomerTest1 {

	static void main(String[] args) {
		Customer customerLee = new Customer(10010, "이순신");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());

		VIPCustomer customerKim = new VIPCustomer(10020, "김유신", 12345);
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		// 업 캐스팅 : 부모타입 클래스로 선언함
		Customer vc = new VIPCustomer(10030, "둘리", 12346);
		

	}
}
