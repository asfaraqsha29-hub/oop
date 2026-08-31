class Rectangle{
	int height;
	int length;
	
	int calculateArea(){
		return height*length;
	}
	public static void main(String[] args){
		 
	  Rectangle r1= new Rectangle();
	  
	  r1.height=6;
	  r1.length=13;
	  

	  int area=r1.calculateArea();
	  
	  System.out.println("area "+area);
}}