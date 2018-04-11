
public class group_reverse {
	
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	void push(int d) {
		Node new_node = new Node(d);
		if(head == null) {
			head = new Node(d);
			return;
		}
		
		new_node.next = head;
		head = new_node;
		
	}
	
	void printlist() {
		Node n;
		n = head;
		while(n!= null) {
			System.out.print(n.data+ "->");
			n = n.next;
		}
	}
	
	public void reverse() {
		
	Node prev = null;
	Node Current = head ;
	Node next = null;
		
		while(Current!= null) {
			next = Current.next;
			Current.next = prev;
			prev = Current;
			Current = next;
		}
		
		head = prev;
	}

	public static void main(String[] args) {
		group_reverse ll = new group_reverse();
		
		for(int i=10;i>0;i--) {
			ll.push(i);
		}
		System.out.println("Before reversing"); 
		ll.printlist();
		System.out.println("\nAfter reversing");
        ll.reverse();
        ll.printlist();
	}

}
