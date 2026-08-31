class Employee{
	
	//private attributes
	private String name;
	private int id;
	private  double salary;
	
	public void setName(String name){
		this.name=name;
	}		
		public String getName(){
        return name;
		}
		
	public void setID(int id){
		this.id=id;
	}
		public int getID(){
			return id;
		}
	public void setSalary(double salary){
		this.salary=salary;
	}
	    public double getSalary(){
			return salary;
		}
}
public class E1{
	public static void main(String args[]){
	    Employee e1= new Employee();
		e1.setName("AqshaNisran");
		e1.setID(001);
		e1.setSalary(55000);
		
		System.out.println("Employee Name :"+e1.getName());
        System.out.println("Employee ID :"+e1.getID());
        System.out.println(" Salary :"+e1.getSalary());
	}
}