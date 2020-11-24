package variable;

public class impliexplit {
    
    public static void main(String[] args) 
    {
        byte bNum = 10;
        int iNum = bNum;

        System.out.println(bNum);
        System.out.println(iNum);

        int iNum2 = 20;
        float fNum = iNum2;
        System.out.println(fNum);

        double dNum;
        dNum = fNum + iNum;
        System.out.println(dNum);

        int i = 1000;
        System.out.println( (byte)i); //이 경우 -24가 나오게 된다. 데이터 유실 발생

        //2진수 OB1010 로 10

        //8진수 012 로 10 

        //16진수 0XA 로 10


    }
}
