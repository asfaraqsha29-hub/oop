import java.util.ArrayList;

public class Ex4{
	
	public static void main(String args[]){
		
		ArrayList<Integer>number=new ArrayList<>();
		
		number.add(10);
		number.add(20);
		number.add(10);
		number.add(30);
		number.add(20);
		number.add(40);
		
		ArrayList<Integer>result=new ArrayList<>();
		
		for(Integer n:number){
			if(!result.contains(n)){
				result.add(n);
			}
		}
		System.out.println(result);
	}
}
		
		