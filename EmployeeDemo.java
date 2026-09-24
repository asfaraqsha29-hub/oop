abstract class Employee{
	String name;
	int EmpID;
	Employee(String name,int EmpID){
		this.name=name;
		this.EmpID=EmpID;
	}
	abstract void calculateSalary();
	void displayEmpDetails(){
		System.out.println("Employee Name :"+name);
		System.out.println("Employee ID :"+EmpID);
	}
}
class Lecturer extends Employee{
	double basicSalary;
	double allowance;
	
	Lecturer(String name,int EmpID,double basicSalary,double allowance){
		super(name,EmpID);
		this.basicSalary=basicSalary;
		this.allowance=allowance;
		
	}
	void calculateSalary(){
        double totalSalary=basicSalary+allowance;
		System.out.println("BasicSalary :"+basicSalary);
		System.out.println("Allowance :"+allowance);
		System.out.println("totalSalarySalary :"+totalSalary);
		System.out.println();
		}
}

class AdminStaff extends Employee{
	double basicSalary;
	double overtimePay;
	
	AdminStaff(String name,int EmpID,double basicSalary,double overtimePay){
		super(name,EmpID);
		this.basicSalary=basicSalary;
		this.overtimePay=overtimePay;
	}
	void calculateSalary(){
        double totalSalary=basicSalary+overtimePay;
		System.out.println("BasicSalary :"+basicSalary);
		System.out.println("overtimePay :"+overtimePay);
		System.out.println("totalSalarySalary :"+totalSalary);
		}
}
public class EmployeeDemo{
  public static void main(String args[]){
     Employee E=new Lecturer("Aqsha",151,50000,15000);
	 System.out.println("=======LECTURER=======");
	 E.displayEmpDetails();
	 E.calculateSalary();
	 
	 Employee E2=new AdminStaff("Jenifer",152,60000,25000);
	 System.out.println("=======ADMINSTAFF=======");
	 E2.displayEmpDetails();
	 E2.calculateSalary();
  }
}
	 
	 