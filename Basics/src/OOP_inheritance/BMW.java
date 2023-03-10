package OOP_inheritance;

public class BMW extends Car{
	@Override
	public void start() {
		System.out.println("BMW-start");
	}
	
 @Override
	public void engine()
	{
		System.out.println("BMW-engine");

	}
    public void autoParking() {
    	System.out.println("BMW-AutoParking");
    }
}
