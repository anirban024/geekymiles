

public class max_min {
	
	public void max_m(int a[]) {
		
		int large = Integer.MIN_VALUE;
		int small = Integer.MAX_VALUE;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>large) {
			   large = a[i];
			}
			if(a[i]<small) {
				small = a[i];
			}
			
		}
		
		System.out.println("largest"+large);
		System.out.println("smallest"+small);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      max_min obj = new max_min();
		int a[] = {2, 10 , 1 , -22};
      
      obj.max_m(a);
	}

}
