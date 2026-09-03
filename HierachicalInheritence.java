class Animal{
	void eat(){
		System.out.println("Animal eat Food");
	}
}
class Dog extends Animal{
	void barks(){
		System.out.println("Dog barks");
	}
}

class Cat extends Animal{
	void meow(){
		  System.out.println("Cats Meows");
	}
}
public class HierachicalInheritence{
	public static void main(String args[]){
		Dog d=new Dog();
		d.eat();
		d.barks();
		
		Cat c=new Cat();
		c.eat();
		c.meow();
	}
}