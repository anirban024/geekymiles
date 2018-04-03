
public class FixedSizeArray {

	protected int capacity;
	
	public int[] stackarr;
	
	protected int top = -1;
	
	public FixedSizeArray(int cap) {
		capacity = cap;
		stackarr = new int[capacity];
	}
	

	public int size() {
		return (top + 1);
	}
	
	public boolean isEmpty() {
		return(top < 0);
	}
	
	public void push(int data) {
		if(size() == capacity) {
			System.out.print("stack is full.Increasing capacity");
			this.IncreaseStack();
        }
        System.out.println("Adding: "+data);
        this.stackarr[++top] = data;
    }
	
	public int pop() {
		int data = 0;
		if(isEmpty()) {
			System.out.print("stack is empty");
		}
		else
		{   data = stackarr[top];
			stackarr[top--] = Integer.MIN_VALUE;
			
		}
		return data;
	}
	
	public int top() {
		if(isEmpty()) {
			System.out.print("empty");
		}
		return stackarr[top];
	}
	
	public void IncreaseStack() {
		
		int newstack[] = new int[this.capacity*2];
		
		for(int i =0;i<capacity;i++) {
			newstack[i] = stackarr[i];
		}
		stackarr = newstack;
		capacity = capacity*2;
	}
	
	
	public static void main(String args[]) {
		
		FixedSizeArray obj1 = new FixedSizeArray(3);
		
		obj1.push(10);
		obj1.push(20);
		obj1.push(30);
		obj1.push(40);
		
	
		obj1.pop();
		for(int i =0;i<=obj1.top;i++) {
			System.out.println(obj1.stackarr[i]);
		}
	}
}
