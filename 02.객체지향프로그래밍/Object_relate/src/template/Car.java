package template;

public abstract class Car {
    public abstract void drive();
    public abstract void stop();

    public void startCar(){
        System.out.println("시동을 킵니다.");
    }

    public void turnOff(){
        System.out.println("시동을 킵니다.");
    }

    final public void run() //절대로 바꾸지 못함 상속 받아도 못바꿈 
    {
        startCar();
        drive();
        stop();
        turnOff();
    }

}