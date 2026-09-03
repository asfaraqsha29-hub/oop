interface Father{
	void work();
}

interface Mother{
	void cook();
}

class Child implements Father,Mother{
	public void work(){
		System.out.println("child Works");
	}
	
	public void cook(){
		System.out.println("child cooks");
	}
}

public class Interface3{
	public static void main(String args[]){
		
		Child ch=new Child();
		ch.work();
		
		ch.cook();
	}
}
	