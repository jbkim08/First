package chapter12.arrayList;

import java.util.ArrayList;
import java.util.List;

class Dog {
    private String name;
    public Dog(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }
}

public class Remove {
    static void main() {
        Dog d1 = new Dog("마틸다");
        List<Dog> dogs = new ArrayList<>();
        dogs.add(d1);
        dogs.add(new Dog("라이언"));
        dogs.add(new Dog("마이클"));
        dogs.add(new Dog("제니"));
        dogs.remove(1); //인덱스번호로 제거
        dogs.remove(d1);     //객체로 제거
        for (Dog d :dogs){
            System.out.println(d);
        }
    }
}
