class B{
	public static void main (String args[]){
	System.out.println("Printing form B");
	A obj1=new A();
	System.out.println("Just created an object of A named obj1 using default constructor");
	System.out.println("Value of x of obj1 = "+obj1.x);
	System.out.println("***Assigning 10 to obj1");
	obj1.x=10;
	obj1.initialize();
	System.out.println("Value of x of obj1 = "+obj1.x);
	System.out.println("Value of y of obj1 = "+obj1.y);
	System.out.println("Value of z of obj1 = "+obj1.z);
	
	A obj2=new A(500,500,700);
	System.out.println("Just created an object of A named obj2 using default constructor");
	System.out.println("Value of x of obj2 = "+obj2.x);
	System.out.println("***Assigning 40 to obj2");
    obj2.x=40;
	System.out.println("Value of x of obj2 = "+obj2.x);
    System.out.println("Value of y of obj2 = "+obj2.y);
    System.out.println("Value of z of obj2 = "+obj2.z);
}
}
