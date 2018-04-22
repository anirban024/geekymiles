package base1;
import java.util.*;
public class Substring {

	public static void main(String[] args) {
		Scanner str = new Scanner(System.in);
        String r = str.nextLine();
         int len = r.length();        
        for(int c=0;c<len;c++) {
        	
        	for(int i =1;i<=len-c;i++) {
        	String sub	= r.substring(c,c+i);
        	System.out.println(sub);
        	}
        }
        
	}

}
