import java.util.*;
public class middle_element {

	static Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node ( int d){
			
			data = d;
			next = null;
		}
	}
	
	public void Middle () {
		Node slow = head;
		Node fast = head;
		if(head!= null)
		{
		while(fast!= null && fast.next!=null) {
			
			fast = fast.next.next;
			slow = slow.next;
		}
		
		System.out.println("middle element"+slow.data);
	}
		}
	
    public void printlist() {
    	Node t = head;
    	while(t!=null) {
    		System.out.println(t.data);	
    		t = t.next;
    		}
    	System.out.println("null");
    	}
    
    public void push(int new_data) {
    	
    	Node new_node = new Node(new_data);
    	new_node.next = head;
    	head = new_node;
     }
    
    
    public static void main ( String [] args) {
    	
    	 middle_element llist = new middle_element();
         for (int i=7; i>0; --i)
         {
        	 
        	 llist.printlist();
             llist.Middle();
             llist.push(i);
            
         } 	
    	
    }
}
