package TheSinglyLinkedList;

import org.w3c.dom.Node;

import java.util.LinkedList;

public class SLL {
    // Best practice to keep class variables as private
    private Node head;
    private Node tail;
    private int length;

    class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }
    // Constructor
   public SLL(int value) {
       // new keyword creates the node
       // newNode is of type Node and can point to a node
       Node newNode = new Node(value);
       // head is of type Node, and can point to a node
       head = newNode;
       // tail points to newNode
       tail = newNode;
       length = 1;
   }

    public void printList(){
        Node temp = head;
        while(temp!= null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }


    public void append(int value){
        Node newNode = new Node(value);
        
    }
}







// Line 12 value and line 13 value are the same
// this.value and line 9 value are the same