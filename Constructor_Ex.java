public class Constructor_Ex{
	int modelYear;
	String modelName;
	
	//public Constructor_Ex(String modelName){
	//this(2020,modelName);
//}


	public Constructor_Ex(int modelYear, String modelName){
		this.modelYear=modelYear;
		this.modelName=modelName;
	}
	
	public void printInfo(){
		System.out.println(modelYear+"  "+modelName);
	}
	
	public static void main(String args[]){
		Constructor_Ex Car1=new Constructor_Ex(2005,"Corvette");
		Constructor_Ex Car2=new Constructor_Ex(1969,"Mustang");

        Car1.printInfo();
		Car2.printInfo();

	}
}
