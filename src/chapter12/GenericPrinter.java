package chapter12;

import chapter11.GameLevel;

//제네릭 타입의 클래스
public class GenericPrinter<T extends Material> {
    private T meterial;

    public T getMeterial() {
        return meterial;
    }

    public void setMeterial(T meterial) {
        this.meterial = meterial;
    }

    static void main() {
        //1 파우더 입력
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
        powderPrinter.setMeterial(new Powder());
        Powder powder = powderPrinter.getMeterial();
        System.out.println(powder);
        //2 플라스틱 입력
        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
        plasticPrinter.setMeterial(new Plastic());
        Plastic plastic = plasticPrinter.getMeterial();
        System.out.println(plastic);
    }
}
abstract class Material{
    abstract void doPrinting();
}

class Powder extends Material {
    public void doPrinting(){
        System.out.println("Powder 재료로 출력합니다.");
    }
    public String toString(){
        return "재료는 Powder입니다.";
    }
}

class Plastic extends Material  {
    public void doPrinting(){
        System.out.println("Plastic 재료로 출력합니다.");
    }
    public String toString(){
        return "재료는 Plastic 입니다.";
    }
}
