package thisex;

public class Persontest {
    public static void main(String args[]){
        Person personNoname = new Person();
        personNoname.showInfo();

        Person personLee = new Person("Lee", 20);
        personLee.showInfo();
        
        Person p = personLee;
        System.out.println(p.getself());
        System.out.println(personLee.getself());
    }
}
