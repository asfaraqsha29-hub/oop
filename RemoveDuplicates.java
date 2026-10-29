import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplicates{
	public static void main(String args[]){
		ArrayList<Integer> number=new ArrayList<>();
		
		number.add(10);
		number.add(20);
		number.add(10);
		number.add(30);
		number.add(20);
		number.add(40);
		
		System.out.println("Original List :"+number);
		
		LinkedHashSet<Integer>uniqueNumber=new LinkedHashSet<>(number);
		
		number=new ArrayList<>(uniqueNumber);
		
		System.out.println("List without duplicates"+number);
	}
}