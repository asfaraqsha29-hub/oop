public class Ex9{
	static int reverse(int n){
		int rev=0;
		while(n!=0){
			rev=rev*10+n%10;
			n=n/10;
		}
		return rev;
	}
		public static void main(String[] args){
			int result=reverse(1234);
			System.out.println(result);
		}
	}