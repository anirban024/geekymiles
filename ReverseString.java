package base1;
import java.util.*;
public class ReverseString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        String r = s.nextLine();
        char ar [] = r.toCharArray();
        int len = ar.length;
        
        for( int i = len-1;i>=0;i--) {
        	   System.out.print(ar[i]);
        }
	}

}
