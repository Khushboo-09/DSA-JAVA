package reverse;

public class Main {
    public static void main(String[] args) {

        final String PRINTLISTSTRING = "Printing  LinkedList - ";
        LinkedList myLinkedList = new LinkedList(4);

        myLinkedList.appendNode(5);
        myLinkedList.prepend(9);
        myLinkedList.appendNode(7);
        myLinkedList.prepend(8);
        myLinkedList.prepend(3);
        System.out.println(PRINTLISTSTRING);
        myLinkedList.printList();
        System.out.println("Reversing the list  and then printing.");
        myLinkedList.reverse();  
        myLinkedList.printList();

    }
}
