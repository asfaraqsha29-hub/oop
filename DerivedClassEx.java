// base class
class Person{
	
	//variable of the base class
	String name;
	
	//method of the base class
	void displayName(){
		System.out.println("Name : "+name);
	}
}

//Student is a derived class of a person
class Student extends Person{
	
	// variable belonging to student
	int marks;

    // method belonging to student
	void displayMarks(){
		System.out.println("Marks : "+marks);
	}
}
//main class
public class DerivedClassEx{
	public static void main(String args[]){
		Student s=new Student();
		s.name="Nisran";
		s.marks=88;
		
		s.displayName();
		s.displayMarks();
	}
}