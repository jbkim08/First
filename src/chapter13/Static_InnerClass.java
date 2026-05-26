package chapter13;

class Person {
    class Head{
        public void print(){
            System.out.println("Head");
        }
    }
    static class Body{
        public void print(){
            System.out.println("Body");
        }
    }
    public void print(){
        //내부 클래스를 내부에서 객체를 만들어 사용 (쉬움)
        Head head = new Head();
        Body body = new Body();
        head.print();
        body.print();
    }
}

public class Static_InnerClass {
    static void main() {
        Person p1 = new Person();
        p1.print();
        //이너클래스
        Person.Head head = p1.new Head();
        head.print();
        //스테틱 이너클래스
        Person.Body body = new Person.Body();
        body.print();
    }
}
