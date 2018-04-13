
 class stack_array {
	
	int MAX = 1000;
	int top;
	int a[] = new int[MAX];

	
	stack_array() {
		top = -1;
	}
	
	
	int push(int x) {
		
		if(top>MAX) {
			System.out.println("stack overflow");
			return 0;
		}
		
		else {
			a[++top] = x;
			return x;
		}
	}
	
	public int pop() {
		
		if(top< 0) {
			System.out.println("stack underflow");
			return 0;
		}else {
			int x = a[top--];
			return x;
		}
	}
	
	public static void main(String[] args) {
		stack_array obj = new stack_array();
		int i;
		for(i = 1;i<10;i++) {
			System.out.print("\t"+obj.push(i));
			
		}
		
		System.out.println("\nPopped item"+" "+obj.pop());

	}

}
