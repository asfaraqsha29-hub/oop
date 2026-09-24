//interface with reference method
interface Animal{
	void sound();
}
class Dog implements Animal{
	public void sound(){
		System.out.println("Dogs Barks");
	}
}
class Cat implements Animal{
	public void sound(){
		System.out.println("Cat Meows");
	}
}
public class ReferenceInterface{
	public static void main(String args[]){
		Animal a;
		a=new Dog();
		a.sound();
		
		
		a=new Cat();
		a.sound();
	}
}