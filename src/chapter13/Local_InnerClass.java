package chapter13;

public class Local_InnerClass {
    private String name;

    public Local_InnerClass() {
        name = "엘리자베스";
    }

    static void main() {
        Local_InnerClass local = new Local_InnerClass();
        local.run();
    }

    public void run(){
        //메소드 안에 클래스 => 로컬 이너 클래스
        class Printer {
            public void print(){
                System.out.println(name); //내부 클래스에서 외부의 변수 접근가능
            }
        }
        new Printer().print();
    }
}
