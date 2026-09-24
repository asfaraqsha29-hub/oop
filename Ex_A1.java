class Person{
	String name;
	int age;
	void displayperson(){
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
	}
}
class Student extends Person{
	String student_id;
	String course;
	void displaystudent(){
		System.out.println("Student_ID :"+student_id);
		System.out.println("Course :"+course);
	}
	
}

public class Ex_A1{
	public static void main(String args[]){
		Student s=new Student();
		s.name="Aqsha";
		s.age=21;
		s.student_id="2024it151";
		s.course="Bsc.IT";
		
		s.displayperson();
		s.displaystudent();
	}
}