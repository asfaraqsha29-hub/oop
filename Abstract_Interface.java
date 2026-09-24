interface Vehicle{
	void start();
}
class Car implements Vehicle{
	public void start(){
		System.out.println("Car Start Engine");
		
	}
}
class ElectricCar implements Vehicle{
	public void start(){
		System.out.println("Electric Motor Starts");
	}
}
	
public class Abstract_Interface{
	public static void main(String args[]){
		Car c=new Car();
		c.start();
		
		ElectricCar e=new ElectricCar();
		e.start();
		

		
	}
}