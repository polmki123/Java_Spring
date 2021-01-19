package polymorphism;

public class VipCustomer extends Customer{
    public VipCustomer()
    {
        super(0,0); // 상위 클래스의 메모리 위치를 가지고 있다. 이렇게 사용하면 상위 클래스의 생성자를 가지고 오게 된다.
        // 만약 상위 클래스가 기본 생성자가 없는 경우에는 하위클래스에서 무조건 매개변수를 사용하는 생성자를 만들어야 한다.
        a = 10;
        b = 5;
    }

    @Override
    public int calPrice(int a){
      
        return super.calPrice(a);
}
