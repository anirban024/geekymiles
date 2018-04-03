import java.util.*;
public class prime_number {
	
	public static void merge(int a[], int b[],int res[],int n, int m) {
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		int i =0,j=0,k=0;
		while(i < n && j < m) {
			
			if(a[i] < b[j]) {
				res[k] = a[i];
				i++;
				k++;
			}
			else {
				res[k] = b[j];
				j++;
				k++;
			}
		}
		
		while(i < n) {
			
			res[k] = a[i];
			i++;
			k++;
		}
       while(j < m) {
			
			res[k] = b[j];
			j++;
			k++;
		}
		
		
	}
	
	

	
	public static void main(String args[]) {
		
		int a[] = {10, 12, 2};
		int b[] = {3 , 1 , 11};
		int n = a.length;
		int m = b.length;
		int res[] = new int[n + m];
		merge(a, b, res, n, m);
		
		for(int i =0; i<res.length;i++) {
			System.out.print(res[i]+ " ");
		}
		
	}
}
