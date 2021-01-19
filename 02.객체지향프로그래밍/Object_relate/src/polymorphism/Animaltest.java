package polymorphism;

import arraylist2.ArraylistTest;
import java.util.ArrayList;
class Animal {
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}

class Human extends Animal{
    public void move(){
        System.out.println("사람이 두발로 걷습니다.");    
    }
    public void readbooks(){
        System.out.println("책을 읽는다. ");
    }
}

class Tiger extends Animal{
    public void move() {
        System.out.println("호랑이가 네 발로 뜁니다.");
    }
    public void hunting(){
        System.out.println("호랑이가 사냥을 합니다. ");
    }
}

class Eagle extends Animal{
    public void move(){
        System.out.println("독수리가 하늘을 납니다. ");
    }
}
public class Animaltest {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal b = new Tiger();
        Animal c = new Eagle();
        Animal d = new Human();
        
        Animaltest test = new Animaltest();
        test.moveAnimal(a);
        test.moveAnimal(b);
        test.moveAnimal(c);
        test.moveAnimal(d);
        
        // ArrayList<Animal> animalList = new ArrayList<Animal>();
        // animalList.add(a);
        // animalList.add(b);
        // animalList.add(c);
        // Human human = (Human)d; // 이건 인식 한다. 
        if ( d instanceof Eagle) // 아래 처럼 단순히 사용하면 에러가 나기 때문에 이렇게 변경하여 사용한다. 
        {
            Eagle human = (Eagle)d; // 이건 에러가 난다. 캐스팅 오류가 난다. 
            human.readbooks();      
            human.move();
        }

        
        // for ( Animal k : animalList){
        //     k.move();
        // }
    }
    public void moveAnimal(Animal animal){
        animal.move();
    }
}
