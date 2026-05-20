package chapter9;

public class Test {
    static void main() {
        Computer d = new DestTop();
        Computer l = new Laptop();

        Computer[] coms = {d , l};

        for (Computer c : coms){
            c.display();
            c.typing();
            c.hello();
        }
    }
}
