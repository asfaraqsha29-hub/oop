abstract class Animal{
	String name;
	Animal(String name){
		this.name=name;
	}
	abstract void sound();
	void displayName(){
		System.out.println("Animal name :"+name);
	}
}

class Dog extends Animal{
	Dog(String name){
		super(name);
	}
	
	public void sound(){
		System.out.println("Dog Barks");
	}
}
class Cat extends Animal{
	Cat(String name){
		super(name);
	}
	public void sound(){
		System.out.println("Cat Meows");
	}
}
public class AbstractWithConstructor{
    public static void main(String args[]){
		Animal A1=new Dog("Tommy");
		A1.displayName();
		A1.sound();
		
		Animal A2=new Cat("Kitty");
		A2.displayName();
		A2.sound();
	}
}
