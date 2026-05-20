package chapter10;

public class Calculator implements Calc, Calc2{
    @Override
    public int add(int n1, int n2) {
        return n1+n2;
    }

    @Override
    public int sub(int n1, int n2) {
        return n1-n2;
    }

    @Override
    public int times(int n1, int n2) {
        return n1*n2;
    }

    @Override
    public int divide(int n1, int n2) {
        return n1/n2;
    }

    @Override
    public int namuzi(int n1, int n2) {
        return n1%n2;
    }
}
