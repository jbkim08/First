package chapter11;

public record RecodTest(int x, int y) {
    static void main() {
        RecodTest r1 = new RecodTest(1,2);
        System.out.println(r1);
    }
}
