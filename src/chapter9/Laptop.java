package chapter9;

public class Laptop extends Computer{
    @Override
    void display() {
        System.out.println("Laptop Display()");
    }

    @Override
    void typing() {
        System.out.println("Laptop Typing()");
    }
}
