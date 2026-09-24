//compile time polymorphism
public class Main{
	//method to add 2 integers
	public int addition(int x,int y){
		return x+y;
	}


// method to add three integers
public int addition(int x,int y,int z){
		return x+y+z;
	}
	
//method to add two doubles
public double addition(double x,double y){
		return x+y;
	}
public static void main(String args[]){
	Main number=new Main();
	int res1=number.addition(5,6);
	System.out.println("Addition of two numbers :"+res1);
	System.out.println();
	
	int res2=number.addition(5,6,7);
	System.out.println("Addition of three numbers :"+res2);
	System.out.println();
	
	double res3=number.addition(5.5,6.5);
	System.out.println("Addition of three numbers :"+res3);
	System.out.println();
	
}
}