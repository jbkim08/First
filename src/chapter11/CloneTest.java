package chapter11;

class Circle implements Cloneable {
   Point point; //좌표
   int radius;
    public Circle(int x, int y, int radius) {
        this.radius = radius;
        point = new Point(x,y);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "포인트=" + point +
                ", 반지름=" + radius +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class Point {
    int x;
    int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return String.format("(%d,%d)",x,y);
    }
}

public class CloneTest {
    static void main() throws CloneNotSupportedException {
        Circle circle = new Circle(10,20,30);
        Circle copyCircle = (Circle) circle.clone();
        System.out.println(circle);
        System.out.println(copyCircle);
        System.out.println(System.identityHashCode(circle));
        System.out.println(System.identityHashCode(copyCircle));
    }
}
