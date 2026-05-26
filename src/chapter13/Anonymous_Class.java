package chapter13;

public class Anonymous_Class {
    private String name = "펭수";

    static void main() {
        new Anonymous_Class().start();
    }

    private void start(){
        //System.out.println(name);
        Runnable runner = new Runnable() {
            @Override
            public void run() {
                System.out.println(name);
            }
        };

        activate(runner);
    }
    //매개변수가 러너블 인터페이스 => 구현한 클래스의 객체를 입력받아서 run메소드 실행
    public void activate(Runnable runnable){
        runnable.run();
    }
}
