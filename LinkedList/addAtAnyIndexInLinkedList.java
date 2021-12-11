//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
import java.util.*;
public class addAtAnyIndexInLinkedList {
	public static class Node {
		int data;
		Node next;
	}
	
	public static class LinkedList {
		Node head;
		Node tail;
		int size;
		//Adding Last Element
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
		// Adding First Element
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
		// Adding At Any Index
		void addNodeAtAnyIndex(int idx, int val) {
			if(size == 0) {
				addFirst(val);
			} else if(idx == size) {
				addLast(val);
			}// else if(idx < 0 || idx > size) {
//				System.out.println("Invalid Index");
			 else {
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
		// Displaying The Contents of LinkedList
		void display() {
			if(size == 0) {
				return;
			}
			for(Node temp = this.head; temp != null; temp = temp.next) {
				System.out.print(temp.data + " ");
			}
			System.out.println();
		}
		
		// Function for size 
		public int size() {
			return size;
		}
	}
	
	
	public static void main(String args[]) {
		LinkedList list = new LinkedList();
		list.addFirst(10);
		list.addFirst(30);
		list.addNodeAtAnyIndex(0, 0);
		list.addNodeAtAnyIndex(2, 100);
		list.addNodeAtAnyIndex(1, 20);
		System.out.println(list.size);
		list.display();
	}
	
	
//public static void main(String args[]) throws IOException {
////	public static void main(String[] args) throws Exception {
//	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	    LinkedList list = new LinkedList();
//
//	    String str = br.readLine();
//	    while(str.equals("quit") == false){
//	      if(str.startsWith("addLast")){
//	        int val = Integer.parseInt(str.split(" ")[1]);
//	        list.addLast(val);
//	      } else if(str.startsWith("size")){
//	        System.out.println(list.size());
//	      } else if(str.startsWith("display")){
//	        list.display();
//	      } // else if(str.startsWith("removeFirst")){
////	        list.removeFirst();
////	      }
//	      str = br.readLine();
//	    }
//	  }
}

		
	



