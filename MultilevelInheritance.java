class Animal{
	void eat(){
		System.out.println("Animals Eats");
	}
}
class Mammal extends Animal{
	void walk(){
		System.out.println("Mammals Walks");
    }
}
class Dog extends Mammal{
	void bark(){
		System.out.println("Dog barks");
	}
}
public class MultilevelInheritance{
	public static void main(String args[]){
		Dog d=new Dog();
		
		d.eat();
		d.walk();
		d.bark();
	}
}