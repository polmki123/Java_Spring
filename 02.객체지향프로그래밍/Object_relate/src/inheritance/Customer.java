package inheritance;

public class Customer {
    // private int a; // 이렇게 쓰면 하위클래스에서도 접근이 어렵다. 
    // private int b;

    protected int a; // 이렇게 쓰면 하위클래스에서도 접근이 가능하다. 
    protected int b;
    private int c;


    public Customer(int a, int b){
        c = 10;
    }

    public int calPrice(int a){
        System.out.println(a);  
        return a
    }
}
