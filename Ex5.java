import java.util.ArrayList;
import java.util.Scanner;

public class Ex5{
	
	public static void main(String args[]){
		
		ArrayList<String>name=new ArrayList<>();
		
		name.add("Aqsha");
		name.add("Thanooja");
		name.add("Sethmi");
		name.add("Jenifer");
		name.add("Vithusa");

       System.out.println("Enter Your Choic 1-4");
	   
	   Scanner input=new Scanner(System.in);
	   
	   System.out.println("1.Add An Employee");
	   System.out.println("1.Search An Employee");
	   System.out.println("1.Remove An Employee");
	   System.out.println("1.Display All Employees");
	   int n=input.nextInt();
	   
	   switch(n){
		   
		   case 01:
		   {
			   
			   System.out.println("Enter the name :");
			   String newname=input.nextLine();
			   name.add(newname);
			   
		   }
		   
		   case 02:
		   {
			   
			   System.out.println("Enter the name and search the employee :");
			   String newname=input.nextLine();
			   name.add(newname);
			   if(name.contains(name)){
				System.out.println("that is in the list");
				System.out.println();
			     }
			   else{
				  System.out.println("that name is not in the list");
				  System.out.println();
			    }
		   }
		   
		   case 03:
		   {
			   String newname=input.nextLine();
			   name.add(newname);
			   System.out.println("Enter the name of an employee to remove:");
           }
		   
		   case 04:
		   {
			  
			   System.out.println(name);
           }
        
	   }
    }
}