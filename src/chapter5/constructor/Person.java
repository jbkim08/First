package chapter5.constructor;

public class Person {
    String name;
    float height;
    float weight;

    //기본 생성자 (생략가능)
    Person(){} //다른 생성자가 있는경우 꼭 적어야 함
    //이름을 초기화 생성자
    Person(String pName){
        name = pName;
    }
    //이름, 키, 몸무게를 초기화하는 생성자
    Person(String pName, float pheight, float pweight){
        name = pName;
        height = pheight;
        weight = pweight;
    }
}
