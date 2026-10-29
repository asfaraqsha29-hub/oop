import java.util.LinkedList;

class LinkedListEx{
	public static void main(String args[]){
		
		LinkedList<String>cities=new LinkedList<>();
		
		cities.add("Jaffna");
		cities.add("Mannar");
		cities.add("Anuradhapura");
		
		System.out.println("Cities :"+cities);
		System.out.println();
		
		cities.addFirst("Vavuniya");
		
		cities.addLast("Galle");
		
		System.out.println("After Adding new cities :"+cities);
		System.out.println();
		
		cities.remove(2);
		System.out.println("After removing a city :"+cities);
		
	}
}