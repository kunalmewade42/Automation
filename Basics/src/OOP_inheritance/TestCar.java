package OOP_inheritance;



public class TestCar {
	public static void main(String ar[]) {
	BMW b=new BMW();
	b.autoParking();//independent
	b.autoPilot();
	b.engine();
	b.start();//overriding
	b.stop();//inherited
	
	Audi a=new Audi();
	a.autoPilot();
	a.theftSafety();
	a.start();
	a.stop();
	
	Car c=new Car();
	c.start();
	c.stop();
	c.refuel();
	c.autoPilot();
	c.engine();
	
	//type casting
	Car c1=new BMW();
	c1.start();
	c1.start();
	c1.refuel();
	


}
}