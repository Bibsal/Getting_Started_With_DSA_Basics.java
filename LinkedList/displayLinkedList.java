import java.util.*;
public class displayLinkedList {
	private static class Node {
		int data;
		Node next;
	}
	
	private static class LinkedList {
		Node head;
		Node tail;
		int size;
		
		void display() {
			for(Node temp = this.head; temp != null; temp = temp.next) {
				System.out.print(temp.data + " ");
			}
			System.out.println();
		}
	}
	
	
	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		LinkedList list = new LinkedList();
		list.display();
	}
	
}
