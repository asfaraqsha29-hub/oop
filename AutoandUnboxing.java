public class AutoandUnboxing{
	public static void main(String args[]){
		
		//autoboxing (int to unteger)
		int number=100;
		Integer obj=number;
		
		System.out.println("Wrapped Integer : "+obj);
		
		//unboxing (integer to int)
		int result=obj;
		
		System.out.println("Premetive Value :"+result);
		
	}
}