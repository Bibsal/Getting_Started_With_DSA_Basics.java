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
		// Below creating a display method to display/print/show the data of node's in our console
		void display() {
			if(size == 0) {
				return;
			}
			for(Node temp = this.head; temp != null; temp = temp.next) {
				System.out.print(temp.data + " ");
			}
			System.out.println();
		}
		// Adding a new node to the end and joining it with the previous nodes of linkedlist
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
		list.display();                   // callig the display method, here as in the beginning, our linkedlist is empty and has size 0 so this display method will be returned and won't print anything qki hamare pas abhi koi node hai hi nahi, so niche wali line me hum pahli node add karnge, and waha sae hamara linked list diplay hoga as it'll have its first node and also size is 1 now.. 
		list.addLastNode(10);             // here we've added our first node to the last place of our linked list and since there were no previous node's so this will be our first node and also will be our head tail of the linked list and will be printed/displayed as 10 by the below called display method
		list.display();
		list.addLastNode(20);
		list.display();
		list.addLastNode(30);
		list.display();
	}
}