import java.util.*;
public class addLastInLinkedList {
	
	public static class Node {
		int data;
		Node next;
	}
	
	public static class LinkedList {
		Node head;
		Node tail;
		int size;
		
		void display() {
			if(size == 0) {
				return;
			}
			for(Node temp = this.head; temp != null; temp = temp.next) {
				System.out.print(temp.data + " ");
			}
			System.out.println();
		}
		
		void addLastNode(int val) {
			Node nayaNode = new Node();
			nayaNode.data = val;
			nayaNode.next = null;
			
			if(size == 0) {
				head = tail = nayaNode;
			} else {
				tail.next = nayaNode;
				tail = nayaNode;
			}
			
			size++;
		}
	}
	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		LinkedList list = new LinkedList();
		list.display();
		list.addLastNode(10);
		list.display();
		list.addLastNode(20);
		list.display();
		list.addLastNode(30);
		list.display();
	}
}