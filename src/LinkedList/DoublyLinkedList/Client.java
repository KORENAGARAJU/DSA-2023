package LinkedList.DoublyLinkedList;

public class Client{
    public static void main(String[] args) throws Exception {
        DoublyLinkedList list = new DoublyLinkedList() ;

        System.out.println(list.head);
        System.out.println(list.tail);
        System.out.println(list.size);
        System.out.println("----------------------------------");

        list.addFirst(2);
        list.addFirst(1);
        list.addAt(5 , 0);
        System.out.println(list.size) ;

        list.display();
        list.displayReverse();
        System.out.println("---------------------------------");

    }
}
