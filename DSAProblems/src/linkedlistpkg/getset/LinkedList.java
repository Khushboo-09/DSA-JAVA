package getset;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        public Node() {

        }

        public Node(int value) {
            this.value = value;
        }
    }

    public LinkedList() {

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

    public int getLengthVal() {
        return length;
    }

    public void printList() {
        Node tmp = head;
        while (tmp != null) {
            System.out.println(tmp.value);

            tmp = tmp.next;
        }
    }

    public void appendNode(int value) {

        Node newNode = new Node(value);
        newNode.value = value;
        if (length == 0) {

            head = newNode;
            tail = newNode;
            newNode.next = null;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;

    }

    public Node removeNode() {

        if (length == 0) {
            return null;
        }
        Node prevNode;
        Node temp;
        prevNode = head;
        temp = head;

        while (temp.next != null) {
            prevNode = temp;
            temp = temp.next;

        }

        tail = prevNode;
        tail.next = null;
        length--;

        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;

    }

    public Node get(int index) {
        if (index < 0 || index > length) {
            return null;
        }
        Node tmp;
        tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp;
    }

    public boolean set(int index, int value) {
        Node tmp = get(index);
        if (tmp != null) {
            tmp.value = value;
            return true;

        }
        return false;

    }

}
