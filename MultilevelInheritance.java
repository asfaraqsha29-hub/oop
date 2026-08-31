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

public class MultilevelInheritance{
	public static void main(String args[]){
		Mammal m=new Mammal();
		
		m.eat();
		m.walk();
	}
}