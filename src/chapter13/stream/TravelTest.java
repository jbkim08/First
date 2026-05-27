package chapter13.stream;

import java.util.ArrayList;
import java.util.List;

class TravelCustomer{
    private String name;
    private int age;
    private int price;
    public TravelCustomer(String name, int age, int price) {
        this.name = name;
        this.age = age;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "TravelCustomer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", price=" + price +
                '}';
    }
}
public class TravelTest {
    static void main() {
        TravelCustomer customerLee = new TravelCustomer("이순신", 40, 100);
        TravelCustomer customerKim = new TravelCustomer("김유신", 20, 100);
        TravelCustomer customerHong = new TravelCustomer("홍길동", 13, 50);
        List<TravelCustomer> customerList = new ArrayList<>();
        customerList.add(customerLee);
        customerList.add(customerKim);
        customerList.add(customerHong);
        System.out.println("=== 고객 명단 추가된 순서대로 출력 ===");
        customerList.stream()
                .map(c->c.getName())
                .forEach(s-> System.out.println(s));
        int total = customerList.stream()
                .mapToInt(c->c.getPrice())
                .sum();
        int total2 = customerList.stream()
                .map(c->c.getPrice())
                .reduce(0, (n1,n2)-> n1+n2);
        System.out.println("총 여행 경비는 : " + total + "만 원입니다.");
        System.out.println("총 여행 경비는 : " + total2 + "만 원입니다.");

        System.out.println("=== 20세 이상 고객 명단 정렬해서 출력 ==");
        customerList.stream()
                .filter(c->c.getAge() >= 20)
                .map(c->c.getName())
                .sorted()
                .forEach(s-> System.out.println(s));
    }
}
