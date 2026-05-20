package chapter10;

//모든메서드 추상메서드 변수는 상수
public interface Calc {
    double PI = 3.14;
    int ERROR = -99999999;
    //추상메서드 더하기 빼기 곱하기 나누기
    int add(int n1 , int n2);
    int sub(int n1, int n2);
    int times(int n1, int n2);
    int divide(int n1, int n2);

    default void hello(){
        System.out.println("디폴트메소드!");
    }
}
