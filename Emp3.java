class Employee3{
	private int id;
	private String name;
	
	public void Employee3(int id,String name){
		this.id=id;
		this.name=name;
	}
	public int getID(){
		return id;
	}
	public String getName(){
		return name;
	}
}
public class Emp3{
	public static void main(String args[]){
		Employee3 e = new Employee3(101,"aqsha");
	    //.getID(1234);
		
		System.out.println("ID :"+e.getID());
		System.out.println("Name :"+e.getName());
		
		
	}
}
		
	