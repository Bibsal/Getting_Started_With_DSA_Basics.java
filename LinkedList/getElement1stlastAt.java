import java.util.*;

public class getElement1stlastAT {
	public static class Node {
		int data;
		Node next;
	}
	
	public static class LinkedList {
		Node head;
		Node tail;
		int size;
		
		void addFirst(int val) {
			Node nayaNode = new Node();
			nayaNode.data = val;
			if(size == 0) {
				head = tail = nayaNode;
			} else {
				nayaNode.next = head;
				head = nayaNode;
			}
			size++;
		}
		
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
		}
		
		void addNodeAtAnyIndex(int idx, int val) {
			if(size == 0) {
				addFirst(val);
			} else if(idx == size) {
				addLast(val);
			} else {
				Node nayaNode = new Node();
				nayaNode.data = val;
				Node nm1 = head;
				for(int i = 0; i < idx; i++) {
					nm1 = nm1.next;
				}
				Node np1 = nm1.next;
				nayaNode.next = np1;
				nm1.next = nayaNode;
			}
			size++;
		}

		int getFirst() {
			if(size == 0) {
				System.out.println("No element present");
			}
			return head.data;
		}
		
		int getLast() {
			if(size == 0) {
				System.out.println("No element present");
			}
			return tail.data;
		}
		
		int getAt(int idx) {
			if(size == 0) {
				System.out.println("No element present");
			}
			
			Node arrowPoint = head;
			for(int i = 0; i < idx; i++) {
				arrowPoint = arrowPoint.next;
			}
			return arrowPoint.data;
		}
		
	}
	
	public static void main(String args[]) {
		LinkedList list = new LinkedList();
		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(30);
		list.addFirst(40);
		list.addLast(50);
		int FirstValue = list.getFirst();
		int LastValue = list.getLast();
		int anyIndexValue = list.getAt(2);
		System.out.println(FirstValue);
		System.out.println(LastValue);
		System.out.println(anyIndexValue);
	}


	
}
