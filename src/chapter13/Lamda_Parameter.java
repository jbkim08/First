package chapter13;

interface Runner2 {
    void execute(String text);
}

public class Lamda_Parameter {
    static void main() {
        Runner2 run1 = (t)-> System.out.println(t);
        run1.execute("펭수");

        Runner2 run2 = s -> System.out.println(s);
        run2.execute("길동");
    }
}
