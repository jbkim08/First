package chapter6.cooperation;

public class Bus {
    int busNumber;	//버스번호
    int passengerCount; //승객수
    int money;	//버스의 받은돈
	//버스의 생성자
    public Bus(int busNumebr) {
        this.busNumber = busNumebr;
    }

    public void take(int money) {
        this.money += money;
        passengerCount++; //승객수 증가
    }

    public void showInfo() {
        System.out.println("버스 " + busNumber + "번의 승객은 " + passengerCount + "명이고, 수입은 " + money + "입니다.");
    }


}
