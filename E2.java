class Employee_validate{
	private double salary;
	
	public void setSalary(double salary){
		if (salary>=0){
			this.salary=salary;
		}
		else{
			System.out.println("Salary cannot be negative");
		}
		}

	public double getSalary(){
		return salary;
	}
}
public class E2{
	public static void main(String args[]){
		Employee_validate e1=new Employee_validate();
		e1.setSalary(100000);
		System.out.println("Salary :"+e1.getSalary());
		e1.setSalary(-10000);
	}
}
		