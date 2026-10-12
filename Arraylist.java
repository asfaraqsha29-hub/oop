import java.util.ArrayList;
public class Arraylist{
		public static void main(String args[]){
			
			ArrayList<String>students=new ArrayList<String>();
			
			//create an Arraylist to store students names
			students.add("Kamal");
			students.add("Nimal");
            students.add("Saman");
			students.add("Ravi");
			
			//display all students names
			System.out.println("Student List :"+students);
			System.out.println();
			
			//display an element using index
			System.out.println("Student List :"+students.get(0));
			System.out.println();
			
			//size of the namelist
			System.out.println("Student List :"+students.size());
			System.out.println();
			
			//search for a student 
			if(students.contains("Saman")){
				System.out.println("Saman is in the list");
				System.out.println();
			}
			else{
				System.out.println("Saman is not in the list");
				System.out.println();
			}
			//set the student name into students
			students.set(1,"Arun");
			System.out.println("Updated Student List :"+students);
			System.out.println();
			
			//remove a name
			students.remove("Ravi");
			System.out.println("After removed a name from Student List :"+students);
			System.out.println();
			
			//display each student using a loop
			for(String name:students){
				System.out.println(name);
			}
		}
}