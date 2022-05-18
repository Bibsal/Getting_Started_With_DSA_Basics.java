import java.util.*;
public class addLast {
    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        void addLast(int val) {
            // Create a new node and set it's data/val
            Node nayaNode = new Node();
            nayaNode.data = val;
            nayaNode.next = null;
            // Check if head & tail point's to null that happens when size == 0, so check for size == 0 & if yes then since we just created this nayaNode so make this nayaNode as head & tail
            if(size == 0) {
                head = tail = nayaNode;
            } else {
                // Update tail pointer
                tail.next = nayaNode;
                tail = nayaNode;
            }
            // Update size
            size++; 
        }

        void display() {
            if(size == 0) {
                return;
            }
            
            for(Node temp = this.head; temp != null; temp = temp.next) {
                System.out.print(temp.data + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.display();
        list.addLast(20);
        list.display();
        list.addLast(30);
        list.display();
        list.addLast(40);
        list.display();
        list.addLast(50);
        list.display();

        
    }
}
