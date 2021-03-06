import java.util.*;
public class linked_list {
	
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
		    next = null;
		}
	}
		public void printlist() {
			Node n = head;
			while(n!=null) {
				System.out.println(n.data+ " ");
				n = n.next;
			}
	}
		public void append(int new_data) {
			Node new_node = new Node(new_data);
			
			if(head == null) {
				head = new Node(new_data);
			}
			
			new_node.next = null;
			Node last = head;
			
			while(last.next!=null) {
				last = last.next;
				last.next = new_node;
			}
		}

	public static void main(String[] args) {
		
		linked_list obj = new linked_list();
		
		obj.head = new Node(1);
		Node second = new Node(2);
		Node third  = new Node(3);
		
		obj.head.next = second;
		second.next = third;
		
		Node print = obj.head;
		while(print != null)
		{
			System.out.print(print.data+" -> ");
			print = print.next;
		}
			
		}
	}

