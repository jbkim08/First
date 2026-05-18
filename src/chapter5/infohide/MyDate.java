package chapter5.infohide;

public class MyDate {
    private int day;
    private int month;
    private int year;

    //변수에 접근할려면 get(가져옴) / set(입력) 메소드 사용
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        //2월일때 날짜를 28일까지만 적을수 있도록 제한
        if(month == 2){
            if(day < 1 || day >28){
                System.out.println("오류입니다.");
            } else {
                this.day = day;
            }
        } else {
            this.day = day;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
        System.out.println("this :" + this);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
