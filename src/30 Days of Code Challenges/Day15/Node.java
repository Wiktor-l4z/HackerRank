package linkedlist;


public class Node {

    Node next;
    int data;


    public Node getNext() {
        return next;
    }

    public void setNext(Node newNode) {
        this.next = newNode;
    }

    public int getData() {
        return data;
    }

    public void setData(int newData) {
        this.data = newData;
    }

    public Node(int data) {
        this.next = null;
        this.data = data;
    }


}
