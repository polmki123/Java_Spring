package designpattern;

public class Singleton{
    private static Singleton singleton = null;

    protected Singleton(){

    }
    public static Singleton getinstance (){
        if ( singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
