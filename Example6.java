//DemoNonStatic
public class Example6{
	 void hello(){
		System.out.println("Hello Without Static");
	}
	public static void main(String[] args){
		Example6 obj = new Example6();
		
		obj.hello();
	}
}
