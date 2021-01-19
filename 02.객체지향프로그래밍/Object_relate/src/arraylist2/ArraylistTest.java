package arraylist2;

import java.util.ArrayList;


public class ArraylistTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("aaa");
        list.add("bbb");

        for(int i =0; i < list.size(); i++){
            String str = list.get(i);
            System.out.println(str);
        }
        for (Object s : list) // 오브젝트는 모든 클래스의 추상형 
        {
            System.out.println(s);
        }
    }
}
