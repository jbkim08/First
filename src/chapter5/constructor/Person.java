package chapter5.constructor;

public class Person {
    String name;
    float height;
    float weight;

    //기본 생성자 (생략가능)
    Person(){
        this("이름없음"); //this()생성자
    } //다른 생성자가 있는경우 꼭 적어야 함
    //이름을 초기화 생성자
    Person(String name){
        this.name = name;
    }
    //이름, 키, 몸무게를 초기화하는 생성자
    Person(String name, float height, float weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}
