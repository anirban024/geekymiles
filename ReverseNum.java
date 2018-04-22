package base1;

public class ReverseNum {

	public static void main(String[] args) {
		int num = 123, n , rev = 0;
		
		n = num;
		while(n!=0) {
			rev = rev * 10;
			rev = rev + n%10;
			n = n/10;
		}
		
		System.out.println(rev);

	}

}
