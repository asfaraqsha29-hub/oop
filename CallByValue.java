class CallByValue{
	static void changeValue(int x){
		x=100;
		System.out.println("inside method :"+x);
	}
	public static void main(String args[]){
		int num=10;
		System.out.println("before method :" +num);
		changeValue(num);
		System.out.println("After method :"+num);
	}
}