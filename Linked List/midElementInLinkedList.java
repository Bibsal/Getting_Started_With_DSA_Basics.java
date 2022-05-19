// WAP to return the data of the mid element in a linkedlist
import java.util.*;
public class MidElem {
	public static class Node {
		int data;
		Node next;
	}
	
	public static class LinkedList {
		Node head;
		Node tail;
		int size;
		
		void addLast(int val) {
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

	
		public int midElement() {
			if(size == 0) {
				System.out.println("List is Empty");
				return;
			} else if(size == 1) {
				return head.data;
			} else {
				Node slow = head;
				Node fast = head;
				while(fast.next != null && fast.next.next != null) {
					slow = slow.next;
					fast = fast.next.next;
				}
				return slow.data;
			}
		}
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);
		int midElement = list.midElement();
		System.out.println(midElement);
	}
}
				public class midElementInLinkedList {
                    
                }
                