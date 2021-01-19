package inheritance;

public class CustomerTest {
    public static void main(String[] args) {
        
        Customer customer = new Customer(0,0);
        Customer vip      = new VipCustomer(); // 묵시적 형변환
        VipCustomer vipCus= new VipCustomer(); // 묵시적 형변환
        // VipCustomer vip   = new Customer(0,0); // 상위 -> 하위 가능 단 하위 -> 상위 불가능


        customer.a = 10; // 같은 패키지 안에서 사용 가능 
        customer  = vipCus; // 묵시적 형 변환 (업캐스팅 )

        
    }
}
