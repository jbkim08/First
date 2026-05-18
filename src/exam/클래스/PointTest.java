package exam.클래스;

public class PointTest {
    static void main(String[] args) {
        // 객체 생성
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 4);
        // 거리 계산
        double dist = Point.distance(p1, p2);
        // 결과 출력
        System.out.printf("두 점 A%s, B%s 사이의 거리: %.2f", p1.toStr(), p2.toStr(), dist);
    }
}
class Point {
    int x;
    int y;
    Point (int _x, int _y) {
        x = _x;
        y = _y;
    }
    //포인트 x,y 좌표 정보 출력
    String toStr() {
        return String.format("(%d, %d)", x, y);
    }
    //스테틱 메소드로 클래스에서 바로 사용함
    static double distance(Point p, Point q) {
        double dX = p.x - q.x; // x좌표의 변화량
        double dY = p.y - q.y; // y좌표의 변화량
        return Math.sqrt((dX * dX) + (dY * dY));
    }
}