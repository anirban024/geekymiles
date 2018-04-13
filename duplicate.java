package array_30;

import java.util.Scanner;

public class duplicate {

	public static void main(String[] args) {
	     
		Scanner obj = new Scanner(System.in);
		int size = obj.nextInt();
		
		int a[] = new int[size];
		int i;
		for( i=0;i<size;i++) {
			a[i] = obj.nextInt();
		}
		
		
		for(int j =0;j<size;j++) {
			
			for(int k=i+1;k<size;k++) {
				
				if(a[j]==a[k]) {
					while(k<(size)-1) {
						a[k]=a[k+1];
						k++;
					}
					size--;
				}
			}
		}
		System.out.println(size);
		for(int p=0;p<size;p++) {
			System.out.println(a[p]);
		}

	}

}
