class Animal{
	void sound(){
		System.out.println("Animal Make Sound");
	}
}
class Dog extends Animal{
	void sound(){
		System.out.println("Dog Barks");
	}
	void display(){
		sound();
		super.sound();
	}
}
public class Super1{
	public static void main(String args[]){
		Dog d=new Dog();
		d.display();
	}
}
	