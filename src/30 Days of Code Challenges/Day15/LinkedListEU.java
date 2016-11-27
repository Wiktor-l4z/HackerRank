package linkedlist;

import java.util.LinkedList;

public class LinkedListEU {

    Node head;
    int count;


    public LinkedListEU(Node newHead) {
        this.head = newHead;
        this.count = 1;
    }
    // Methods

    // add
    public void add (int data){
        Node temp = new Node(data);
        Node current = head;
        while (current.getNext() != null){
            current = current.getNext();
        }
        current.setNext(temp);
        count++;
    }

    //get
    public int get(int index){
        if (index <= 0){
            return -1;
        }
        Node current = head;
        for (int i = 1; 1< index; i++ ){
            current = current.getNext();
        }
        return current.getData();
    }

    // size
    public int size(){
        return count;
    }

    // isEmpty
    public boolean isEmpty(){
        return head == null;
    }

    // remove
    public  void remove(){
        // remove from the back of the list
        Node current = head;
        while (current.getNext().getNext() != null){
            current = current.getNext();
        }
        current.getNext();
        count--;
    }

    public static void main(String[] args) {
        LinkedList<String> linkedlist = new LinkedList<String>();
        linkedlist.add("Alice");
        System.out.println(linkedlist);
        linkedlist.add("Alicey");
        System.out.println(linkedlist);
    }
}
