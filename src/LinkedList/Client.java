package LinkedList;

public class Client {
    public static void main(String[] args) throws Exception {
        LinkedList list = new LinkedList() ;
        System.out.println(list.head) ;
        System.out.println(list.tail) ;
       // System.out.println(list.size) ;

       /* list.addFirst(5);
        list.addFirst(1);
            //list.addAt(1 , 5);*/

        list.addLast(2);
        list.addLast(3);
        list.addFirst(1);
      //  System.out.println("size: "+list.size);
      //  list.displayList();

        list.addAt(2, 5);
        list.addAt(0,1);
        list.addAt(5,54);
        System.out.println("size: "+list.size);
        list.displayList();
        //delfirst
        list.removeFirst() ;
        list.removeLast() ;
        list.removeAt(1) ;
        System.out.println("size: "+list.size);
        list.displayList();

    }

}
