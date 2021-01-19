package polymorphism;

public class GoldCustomer extends Customer{
   
    double Ratio;
    int point;
    public GoldCustomer(int ID, int Name){
        super(ID, Name);
        Grade = "Gold";
    }   
    public int calPrice(int price){
        point += price*Ratio;
        return point;
    }
}
