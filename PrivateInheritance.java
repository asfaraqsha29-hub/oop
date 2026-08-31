// parent class
class Employee{
	private double salary;
	
	//private variable
	public void setSalary(double salary){
		
		//store salary in private variable
		this.salary=salary;
	}

	
	//public method to get salary
	public double getSalary(){
		
		//return private variable
		return salary;
	}
}
//child class
class Manager extends Employee{
	void displaySalary(){
		
		//access private variable indirectly through the method
		System.out.println("Salary : "+getSalary());
	}
}
public class PrivateInheritance{
	public static void main(String args[]){
		Manager m=new Manager();
		
		m.setSalary(100000);
		
		m.displaySalary();
	}
}
	
		