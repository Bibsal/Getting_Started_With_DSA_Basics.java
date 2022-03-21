import java.util.*;
public class addFirstInLinkedList {
    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        /*
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
        */
        void addFirstNode(int val) {
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

        void display() {
            if(size == 0) {
                return;
            }
            for(Node temp = this.head; temp != null; temp = temp.next) {
                System.out.print(temp.data + " ");
            }
        }
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        LinkedList list = new LinkedList();
        list.addFirstNode(30);
        list.addFirstNode(99);
        list.addFirstNode(200);
        list.display();
    }
}