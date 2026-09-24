interface Collage{
    int Pass_Marks=40;
}

class Student implements Collage{
	void display(){
		System.out.println("Pass Marks :"+Pass_Marks);
	}
}
public class InterfaceVariable{
	public static void main(String args[]){
		Student s=new Student();
		s.display();
	}
}
