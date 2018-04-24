
public class CountOccurence {

	Node head;
	
	class Node {
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}
		
		
		     
		}
		
		void print(int data) {
			
			while(head!=null) {
				head = head.next;
				System.out.print(head);
			}
		}
		
		int CountSearch(int search) {
			
			int count = 0;
			
			while(head!=null) {
				if (head.data == search) {
					count++;
					head = head.next;
					
				}
				
			}
			
			return count;
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      CountOccurence c = new CountOccurence();
      c.push(1);
      c.push(2);
      c.push(1);
      c.push(3);
      c.push(1);
      c.CountSearch(1);
	}
	
	public void push(int data) {
		
		Node new_node = new Node(data);
	     new_node.next = head;
	     head = new_node;

	
}}
