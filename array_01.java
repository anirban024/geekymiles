package array_30;

import java.util.*;

public class array_01 {
	
	int binary(int a[], int x) {

		int l =0, r= a.length-1;
		
		int mid = l + (r-1)/2;
		
		while(l<=r) {
			
			if(a[mid] == x)
				return mid;
			
			if(a[mid]< x) {
				l = mid +1;
			}
			
			else {
				r = mid -1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
        array_01 obj = new array_01();
		int arr[] = {5,6,1,2,8,9};
			Arrays.sort(arr);
	int x =2;	
    int result = obj.binary(arr, x);
    
    if(result == -1) {
    	System.out.println("not found");
	}else {
		
	}
		System.out.println("found"+result);

}}
