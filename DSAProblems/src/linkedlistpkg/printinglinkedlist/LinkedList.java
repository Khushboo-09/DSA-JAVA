package printinglinkedlist;

public  class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int val) {
        Node newNode = new Node(val);
        head = newNode;
        tail = newNode;
        length = 1;

    }

    public void getHead() {
        if (head == null) {
            System.out.println("Head - Null");
        } else {
            System.out.println("Head - " + head.value);
        }
    }

    public void getTail() {
        if (head == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void printList() {
        Node tmp = head;
        while (tmp != null) {
            System.out.println(tmp.value);
            tmp = tmp.next;
        }
    }

}
