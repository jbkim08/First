package chapter9;
// 추상 클래스 안에 추상 메소드
public abstract class Computer {
    abstract void display();
    abstract void typing();

    final void hello(){
        System.out.println("헬로우");
    }
}
