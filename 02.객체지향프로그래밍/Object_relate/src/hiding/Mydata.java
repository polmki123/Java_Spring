package hiding;

public class Mydata {
    // 이렇게 쓸 경우 어디에서든 참고 가능 
    // public int day;
    // public int month;
    // public int year;

    private int day;
    private int month;
    private int year;

    public int getDay() {
        return this.day;
    }

    public void setDay(int day) {
        this.day = day; // 이렇게 쓰는 이유는 위의 들어오는 매개변수와 this 즉 클래스를 그리기 위해서 사용 
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void showData(){
        System.out.println("gogogo");
        System.out.println(year + "년" + month + "월");
    }
}
