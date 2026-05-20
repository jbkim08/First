package exam.상속인터페이스;

public class DrinkTest{
    static void main(String[] args) {
        // 서로 다른 객체 생성
        Juice j = new Juice();
        Coffee c = new Coffee();
        Beer b = new Beer();
        Water w = new Water();
        Tea t = new Tea();

        // 부모 클래스 타입의 배열 생성
        Drink[] drinks = { j, c, b, w, t };

        // 모든 음료를 주문!
        for (Drink d : drinks) {
            d.ordered();
        }
    }
}
//상위클래스(부모)
class Drink{
    String name;
    double price;
    public void ordered() {
        System.out.println(name + " 주문되었습니다.");
    }
}
class Juice extends Drink{
    public Juice() {
        name = "쥬스";
    }
}

class Coffee extends Drink {
    public Coffee() {
        name = "커피";
    }
}

class Beer extends Drink {
    public Beer() {
        name = "맥주";
    }
}

class Water extends Drink {
    public Water() {
        name = "물";
    }
}

class Tea extends Drink{
    public Tea() {
        name="차";
    }
}