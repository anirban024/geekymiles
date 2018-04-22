package base1;
import java.util.*;
public class Swap {

	public static void main(String[] args) {
		int a , b , temp;
		
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		b = s.nextInt();
		
		System.out.println("Before"+a+" "+b);
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("after" +a+" "+b);

	}

}
