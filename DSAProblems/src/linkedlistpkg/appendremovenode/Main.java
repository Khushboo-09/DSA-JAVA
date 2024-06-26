package appendremovenode;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(4);

        myLinkedList.appendNode(5);
        myLinkedList.appendNode(9);
        myLinkedList.appendNode(10);
        System.out.println("\nLinked List after append:");
        myLinkedList.printList();

        System.out.println("Removing element from End.");

        System.out.println("First Removal-"
                + ((Integer.toString(myLinkedList.getLengthVal()).compareTo("0") == 0) ? myLinkedList.removeNode()
                        : myLinkedList.removeNode().value));

        System.out.println("Second Removal-"
                + ((Integer.toString(myLinkedList.getLengthVal()).compareTo("0") == 0) ? myLinkedList.removeNode()
                        : myLinkedList.removeNode().value));

        System.out.println("Third Removal-"
                + ((Integer.toString(myLinkedList.getLengthVal()).compareTo("0") == 0) ? myLinkedList.removeNode()
                        : myLinkedList.removeNode().value));

        System.out.println("Fourth Removal-"
                + ((Integer.toString(myLinkedList.getLengthVal()).compareTo("0") == 0) ? myLinkedList.removeNode()
                        : myLinkedList.removeNode().value));

        System.out.println("Fifth Removal-"
                + ((Integer.toString(myLinkedList.getLengthVal()).compareTo("0") == 0) ? myLinkedList.removeNode()
                        : myLinkedList.removeNode().value));

                        

    }
}
