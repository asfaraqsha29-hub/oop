class MethodCalling{
	static int square(int n){
		return n*n;
	}
	static int sumOfSquare(int a, int b){
		return square(a)+square(b);
	}
	public static void main(String args[]){
		int result = sumOfSquare(5,6);
		System.out.println("Result is :"+result);
	}
}