
public class Reverse_i1 {
	
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
		
		public void push(int d) {
			Node new_node = new Node(d);
			
			if(head == null) {
				head = new Node(d);
				return;
			}
			
			new_node.next = head;
			head = new_node;
		}
	
		public void printlist() {
			
			Node n;
			n = head;
			
			while(n!=null) {
				System.out.print(n.data+ "->");
				n = n.next;
			}
		}
		
		public void push_last(int d) {
			Node Last;
			Last = head;
			Node new_node = new Node(d);
			while(Last.next!= null) {
				Last = Last.next;
			}
			Last.next = new_node;
		}

		
		public void reverse() {
			
			Node prev = null;
			Node next = null;
			Node Current = head;
			
			while(Current!=null) {
				next = Current.next;
				Current.next =prev;
				prev = Current;
				Current = next;
			}
			head = prev;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Reverse_i1 obj = new Reverse_i1();
        
        for(int i = 10;i>0;i--) {
        	obj.push(i);
        }
        
        obj.push_last(11);
        
        System.out.println("Before reverse");
        obj.printlist();
        
        
        System.out.println("\nAfter Reverse");
        obj.reverse();
        obj.printlist();
	}

}
