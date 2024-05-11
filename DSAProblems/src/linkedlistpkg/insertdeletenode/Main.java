package insertdeletenode;

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

        System.out.println("Inserting 23  at 3rd position.");
        myLinkedList.insert(3, 23);
        System.out.println("Printing  LinkedList after insertion - ");
        myLinkedList.printList();
        

        System.out.println("Deleting element at 5th position.");
        System.out.println("Value of element at 5th postion if exists or null - "+(((myLinkedList.getLengthVal()<0 ) || (myLinkedList.getLengthVal() < 5)) ? myLinkedList.delete(5)
        : myLinkedList.delete(5).value));

        System.out.println("Printing  LinkedList after first deletion - ");
        myLinkedList.printList();
        

        System.out.println("Deleting element at 10th position.");
        System.out.println("Value of element at 10th postion if exists or null - "+(((myLinkedList.getLengthVal()<0 ) || (myLinkedList.getLengthVal() < 10)) ? myLinkedList.delete(10)
        : myLinkedList.delete(10).value));

        System.out.println("Printing  LinkedList after second deletion - ");
        myLinkedList.printList();

    }
}
