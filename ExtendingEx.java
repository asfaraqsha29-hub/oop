//parent class
class Animal{
	
	//method of the parent class
	void eat(){
		System.out.println("Animal is eating");
	}
}
//Dog extends Animal
class Dog extends Animal{
	void bark(){
	System.out.println("Animal is barking");
	}
}
public class ExtendingEx{
	//method of child class
    public static void main(String args[]){

			//create an object of dog
			Dog d=new Dog();
			
			//call inherited method
			d.eat();
			
			//call dog's own methos
			d.bark();
			
	}
}