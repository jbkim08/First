package chapter13;

//람다식은 함수형 인터페이스만 사용
@FunctionalInterface
interface Runner{
    void execute();
}
public class Lamda {
    static void main() {
        Runner runner = () -> System.out.println("헬로우!");
        runner.execute();

        System.out.println(runner instanceof Runner);
        System.out.println(runner.getClass());
    }
}
