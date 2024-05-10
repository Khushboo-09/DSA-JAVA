package getset;

public class Main {
public static void main(String[] args){
    LinkedList myLinkedList = new LinkedList(4);


        myLinkedList.appendNode(5);
        myLinkedList.appendNode(9);
        myLinkedList.appendNode(10);

        System.out.println("Fetching 3rd value -"+myLinkedList.get(2).value);
        System.out.println("Printing  LinkedList - ");
        myLinkedList.printList();


        System.out.println("Updating  value of third index to 6");
        myLinkedList.set(2,6);
         System.out.println("Printing updated LinkedList - ");
         myLinkedList.printList();


        


}
}
