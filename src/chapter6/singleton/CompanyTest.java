package chapter6.singleton;

public class CompanyTest {

	static void main(String[] args) {
		//Company c1 = new Company();
		Company myCompany1 = Company.getInstance();
		Company myCompany2 = Company.getInstance();
		Company myCompany3 = Company.getInstance();

		System.out.println( myCompany1 == myCompany2 );
		System.out.println(myCompany1);
		System.out.println(myCompany2);
		System.out.println(myCompany3);
	}
}
