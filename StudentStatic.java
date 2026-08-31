class StudentStatic{
	int id;
	String name;
	
	static String university="ABC University";
	
	void display(){
		System.out.println("ID ="+id);
		System.out.println("Name ="+name);
		System.out.println("University ="+university);
	}
	public static void main (String args[]){
		StudentStatic S1=new StudentStatic();
		StudentStatic S2=new StudentStatic();

        S1.id=101;
		S1.name="Vithu";
	
	    S2.id=102;
		S2.name="Jenifer";
		
		S1.display();
		S2.display();
		
	}
}

	