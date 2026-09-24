class Animal{
	void eat(){
		System.out.println("Animals Eat");
		}
}
class Dog extends Animal{
	void bark(){
		System.out.println("Dog Barks");
		
	}
}
interface Pet{
    void play();
}

interface Friendly{
void happy();
}

class Labrador extends Dog implements Pet,Friendly{
	public void play(){
		System.out.println("Labrador Plays");
		}
	public void happy(){
		System.out.println("Happy");
	}
	
}
public class HybridInheritance{
	public static void main(String args[]){
		Labrador A1=new Labrador();
		A1.eat();
		A1.bark();
		A1.play();
		A1.happy();
	}
}
	