
public class Delete_node {
	
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
		public void delete(int position) {
			Node temp = head;
			
			if(position == 0) {
				
				head = temp.next;
			}
			
			for(int i = 0;temp!= null && i<position-1;i++) {
				temp = temp.next;
			if(temp == null || temp.next == null) {
				return;
			}
			Node next = temp.next.next;
			temp.next = next;
			}
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
