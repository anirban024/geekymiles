import java.util.*;
public class check {

	public static void main(String args[]) {
	
	ArrayList a = new ArrayList();
	
	for(int i = 0;i< 5 ; i++) {
		{
			a.add(i);
		}
		
	}
		System.out.println(a);
	
	Iterator itr = a.iterator();
	
	while(itr.hasNext()) {
		
		int i =(Integer)itr.next();
		
		System.out.print(i + " ");
		
		if(i % 2 != 0)
			itr.remove();
	}
	System.out.println();
	System.out.println(a);
}
	}
