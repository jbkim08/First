package chapter5.constructor;

public class PersonTest {
    static void main() {
        //생성자 오버로드 : 이름은 같지만 매개변수가 다른 생성자
        Person p1 = new Person();
        Person p2 = new Person("홍길동");
        Person p3 = new Person("이순신",180.0F, 75.0F);
    }
}
