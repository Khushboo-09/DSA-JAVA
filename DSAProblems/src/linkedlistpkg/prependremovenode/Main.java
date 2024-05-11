package prependremovenode;

public class Main {
    public static void main(String[] args) {

        final String PRINTLISTSTRING = "Printing  LinkedList - ";
        LinkedList myLinkedList = new LinkedList(4);


        System.out.println(PRINTLISTSTRING);

        
        myLinkedList.printList();
        System.out.println("Prepending 5 ");
        myLinkedList.prepend(5);
        System.out.println(PRINTLISTSTRING);
        myLinkedList.printList();
        System.out.println("Prepending 9 ");
        myLinkedList.prepend(9);
        System.out.println(PRINTLISTSTRING);
        myLinkedList.printList();
        System.out.println("Prepending 10 ");
        myLinkedList.prepend(10);

        System.out.println("Printing Final LinkedList after prepending all elements - ");
        myLinkedList.printList();
        System.out.println("Removing First element which is -"
                + ((Integer.toString(myLinkedList.getLengthVal()).compareTo("0") == 0) ? myLinkedList.removeFirst()
                        : myLinkedList.removeFirst().value));

        System.out.println("Printing  LinkedList after removing first element - ");
        myLinkedList.printList();

    }
}
