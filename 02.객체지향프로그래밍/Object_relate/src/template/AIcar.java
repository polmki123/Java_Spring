package template;

public class AIcar extends Car{

	@Override
	public void drive() {
		// TODO Auto-generated method stub
        System.out.println("차를 주행합니다. ");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("스스로 멈춥니다.. ");
	}
    
}
