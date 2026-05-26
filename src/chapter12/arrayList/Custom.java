package chapter12.arrayList;

import java.util.ArrayList;

class Person {
    private String name;
    public Person(String name) {
        this.name = name;
    }
    public String toString(){
        return name; //이름 리턴
    }
}

public class Custom {
    static void main() {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("펭수"));
        people.add(new Person("길동"));
        people.add(new Person("라이언"));
        people.add(new Person("둘리"));
        Person p1 = new Person("모름");
        people.add(p1);
        //새로 저장
        people.set(1,new Person("마이클"));

        for (Person p :people){
            System.out.println(p);
        }
    }
}
