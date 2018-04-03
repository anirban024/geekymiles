import java.util.*;
public class bob {

	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 0 , j = 0;
		int bob[] = new int[n];
		int alice[] = new int[n];
		
		for (i =0 ;i<n;i++) {
			bob[i] = s.nextInt();
			alice[i] = s.nextInt();
		}
		
		int sum =0, sum1 = 0;
		
		for (j =0;j<n;j++) {
			sum = sum + bob[j];
			sum1 = sum1 + alice[j];
		}
		
		if(sum > sum1) {
			System.out.println("Alice");
		if(sum1 > sum) {
			System.out.println("Bob");
			}
		if(sum == sum1) {
			System.out.println("Draw");
		}
		}
	}
}
