import java.util.HashSet;
import java.util.Scanner;

public class HashSetEx{
	public static void main(String args[]){
		
		HashSet<Integer>numbers=new HashSet<>();
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(30);
		numbers.add(20);
		numbers.add(10);
		
		System.out.println("HashSet Elements :"+numbers);
		System.out.println("Size :"+numbers.size());
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter a number");
		int searchNumber=input.nextInt();
		
		if (numbers.contains(searchNumber)){
			System.out.println(searchNumber+" Exsist in theHashSet");
		}
		else{
			System.out.println(searchNumber+" does not exsist the HashSet ");
		}
		input.close();
	}
}