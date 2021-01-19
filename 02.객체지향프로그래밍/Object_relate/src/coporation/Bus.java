package coporation;

public class Bus {
    int busNumber;
    int passengerCount;
    int money;

    public Bus(int busNumber, int passengerCount, int money){
        this.busNumber = busNumber;
        this.passengerCount       = passengerCount;
        this.money = money;
    }
    public void showinfo(){
        System.out.println( busNumber + '남은 돈은' + money);
    }
}
