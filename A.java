class A{
	int x;
	int y;
	int z;
	
	A(){
	x=5;
	y=10;
	z=20;
	System.out.println("----Printin from default construction A()----");
	}
	A(int n1, int n2, int n3){
		System.out.println("----Printin from default construction A(int,int,int)----");
	    x=n1;
		y=n2;
		z=n3;
		
}
void initialize(){
	x=1;
	y=2;
	z=3;
}
}
	