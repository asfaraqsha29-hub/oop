class Employee{
	 String employee_id;
	 String name;
	 double salary;
	 double bonus;
	
	public void setsalary(double salary){
		
		this.salary=salary;
	}
	public double getsalary(){
		return salary;
	}
	public void setbonus(double bonus){
		this.bonus=bonus;
	}
	public double getbonus(){
		return bonus;
	}
}
class Manager extends Employee{
	String department;

	
	
	void displaymanager(){
		double totalsalary=getsalary()+getbonus();
		System.out.println("Salary :"+getsalary());
		System.out.println("Bonus :"+getbonus());
		System.out.println("total Salary :"+totalsalary);

	}
}
public class Ex_A2{
	public static void main(String args[]){
		Manager m=new Manager();
		
		m.employee_id="2024it151";
		m.name="Aqsha";
		m.department="IT";
		m.setsalary(15000);
		m.setbonus(5000);
		
		
		m.displaymanager();
	}
}
		
	
	
	