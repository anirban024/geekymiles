
public class reverse_knode {
	
	static Node head;
	
	static class Node{
		
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
		
		Node reverse(Node node, int k) {
			
			Node current = node;
			Node prev = null;
			Node next = null;
			int i = 0;
			while(i < k && current!=null) {
				next = current.next;
				current.next = prev;
				prev = current;
				current = next;
				i++;
			}
			
			if(current!=null) {
				node.next = reverse(next,k);
			}
			
			return prev;
			
		}
	
	
	public void push(int d) {
		
		if(head == null) {
			head = new Node(d);
			return;
		}
		
		Node new_node = new Node(d);
		
		new_node.next = head;
		head = new_node;
	}
	
	
	public void printlist() {
		
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+ " ");
			temp = temp.next;
		}
	}
	
	

	public static void main(String[] args) {
	  
		reverse_knode obj = new reverse_knode();
		
		for(int i = 11;i>0;i--) {
			obj.push(i);
		}

		System.out.println("before reverse");
		obj.printlist();
		
		System.out.println("\nafter reverse");
		head = obj.reverse(head,3);
		
		obj.printlist();
	}
}




