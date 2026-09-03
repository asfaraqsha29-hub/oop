interface Animal{
	//declare an abstract method called sound
	void sound();
	
	//declare another abstract method called eat
	void eat();
}

//create a clas called dog
class Dog implements Animal{
	
	//provide the implementation of the sound() method
	public void sound(){
		System.out.println("Dog barks");
	}
	//provide the implimentation of the eat() method
	public void eat(){
		System.out.println("Dogs eat bones");
	}
}

public class Main{
	public static void main(String args[]){
		Dog d=new Dog();
		d.sound();
		d.eat();
	}
}
	

