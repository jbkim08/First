package chapter12.arrayList;

import java.io.Serializable;

class Creature implements Serializable{}
class Cat extends Creature{}

public class InstanceOf {
    static void main() {
        Creature c1 = new Creature();
        Object c2 = c1;
        Cat c3 = new Cat();
        Serializable c4 = (Serializable) c3;
        System.out.println(c1 instanceof Object);
        System.out.println(c1 instanceof Serializable);
        System.out.println(c1 instanceof Creature);
        System.out.println(c1 instanceof Cat);
    }
}
