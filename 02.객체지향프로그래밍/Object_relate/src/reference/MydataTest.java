package reference;

import hiding.Mydata;

public class MydataTest {
    public static void main(String[] args) {
        Mydata data = new Mydata();
        data.day = 10; // 그냥 이렇게 쓸 경우 보이지 않는 다는 오류가 발생한다. 
    }
}
