interface Printable{
	void print();
}
interface Scanable{
	void scan();
}
class Printer implements Printable,Scanable{
	public void print(){
		System.out.println("Priter can Print");
	}
	public void scan(){
		System.out.println("Printer can Scan");
	}
}
public class MultipleInheritance{
	public static void main(String args[]){
		Printer p=new Printer();
		p.print();
		p.scan();
	}
}