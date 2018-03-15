import java.util.*;
public class Reverse {

	static Node head;
	
	static class Node {
		
		int data;
		Node next;
		
		Node (int d){
			data = d;
			next = null;
			
		}
	}
	
	Node reverse(Node node) {
		Node prev = null;
		Node Current = node;
		Node next = null;
		
		while(Current!= null) {
		  next = Current.next;
		  Current.next = prev;
		  prev = Current;
		  Current = next;
		}
		node = prev;
		return node;
	}
	
	void printlist(Node node) {
		
		while(node!= null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}
	
	public static void main(String[] args) {
		Reverse list = new Reverse();
		list.head = new Node(85);
		list.head.next = new Node(15);
		list.head.next.next = new Node(4);
		list.head.next.next.next = new Node(20);
		
		System.out.println("Given Linked List");
		list.printlist(head);
		head = list.reverse(head);
		System.out.println(" ");
		System.out.println("Reverse linkedlist");
		list.printlist(head);
		
	}
}
