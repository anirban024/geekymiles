import java.util.*;
public class maximum_val {

	
	static class stack1 {
		
		int val;
		int curMax;
		
		public stack1(int val, int curMax) {
			this.val = val;
			this.curMax = curMax;
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = Integer.MAX_VALUE;
		
		Stack<stack1> st = new Stack<stack1>();
		
		while(n > 0) {
			int choice = sc.nextInt();;
			if(choice == 1) {
				int val = sc.nextInt();
				max = (val>max)?val:max;
				
				st.add(new stack1(val, max));
			}
			else if(choice == 2) {
				if(!st.isEmpty()) {
			    st.pop();
		}
				if(st.isEmpty())
					max = Integer.MIN_VALUE;
				else
					max = st.peek().curMax;
	}else if(choice == 3) {
		System.out.println(st.peek().curMax);
	}
		}}}	
