package chapter13;

interface Runner3 {
    void execute(String name, String text);
}

public class Lamda_Parameter2 {
    static void main() {
        Runner3 run = (n, t) -> System.out.printf("%s님 %s \n",n,t);
        run.execute("펭수", "안녕하세요~");

        greet(run);
    }

    private static void greet(Runner3 run){
        run.execute("길동", "안녕하세요~");
    }
}
