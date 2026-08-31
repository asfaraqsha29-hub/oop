class Student{
	//private variable
	private String name;
	
	//setter method
	public void set_name(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public class Main{
		public static void main(String args[]){
			
			//create student object
			Student S1= new Student();
			//S1.name="Aqsha";
			S1.set_name("Aqsha");
			
			//get name using setter
			System.out.println("Student Name :"+S1.getName());
		}
}}		
	
	