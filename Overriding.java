class Vehicle{
	public void displayinfo(){
		System.out.println("Some vehicles are there");
	}
}
class Car extends Vehicle{
	
	public void displayinfo(){
		System.out.println("I have a car");
	}
}
public class Overriding{
	public static void main(String args[]){
		Vehicle V=new Vehicle();
		V.displayinfo();
		
		Car C=new Car();
		C.displayinfo();
	}
}
		