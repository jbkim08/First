package chapter14.exception;

class Thermostat{
    public void setTemperature(double temp) throws Exception {
        if(temp < 0 || temp > 35){
            throw new Exception("온도가 비정상 입니다.");
        }
        System.out.println("현재 온도 세팅 : " + temp);
    }
}

public class App4 {
    static void main() {
        Thermostat stat = new Thermostat();
        try {
            stat.setTemperature(40);
        } catch (Exception e) {
            System.out.println("온도세팅 예외 발생!");
        }
    }
}
