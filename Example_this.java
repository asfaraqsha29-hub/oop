public class Example_this{
	int x;
	public Example_this(int x){
		this.x=x;
	}
	public static void main(String args[]){
		Example_this myObj=new Example_this(82);
		System.out.println("Value of x ="+myObj.x);
	}
}
		
