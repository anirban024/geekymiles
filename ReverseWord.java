package base1;
import java.util.*;
public class ReverseWord {
	
	public void Reverse(String str) {
		
		String [] words = str.split(" ");
		String reverseit = "";
		
		for(int i=0;i<words.length;i++) {
			String word = words[i];
		    String reverseword ="";
		
		for(int j= word.length()-1;i>0;i--)
		{
		  reverseword = reverseword + word.charAt(j);	
		}
	  reverseit = reverseit + reverseword + " ";
	 }
	  System.out.println(str);
	  System.out.println(reverseit);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner n = new Scanner(System.in);
        String r = n.nextLine();
        
        ReverseWord obj = new ReverseWord();
        obj.Reverse(r);
	}

}
