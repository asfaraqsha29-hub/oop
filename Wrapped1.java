public class Wrapped1{
	public static void main(String args[]){
		
		//premittive data type
		int number=100;
		double price=85.00;
		char grade ='A';
		boolean passed=true;
		
		//wrapper class objects
		Integer numberObject=100;
		Double priceObject=85.00;
		Character gradeObject='A';
		Boolean passedObject=true;
		
		//display premitive value
		System.out.println("Premitive int : "+number);
		System.out.println("Premitive double : "+price);
		System.out.println("Premitive char : "+grade);
		System.out.println("Premitive boolean : "+passed);
		
		System.out.println();
		
		//display wrapper object values
		System.out.println("Wrapper class integer : "+numberObject);
		System.out.println("Wrapper class double: "+priceObject);
		System.out.println("Wrapper class character: "+gradeObject);
		System.out.println("Wrapper class boolean: "+passedObject);
		
	}
}