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
    }
}
