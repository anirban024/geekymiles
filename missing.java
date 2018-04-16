
import java.util.*;
public class missing {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,Integer> map = new HashMap<>();
		int arr[] = {3,2,6,3,7,8,9,0,1};
		
		for(int i =0; i<arr.length; i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			}else {
				System.out.print(arr[i]);
			}
		}
      
	}
	
	

}
