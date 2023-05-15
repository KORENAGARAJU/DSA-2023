package Stack;

import LinkedList.singlyLinkedList.LinkedListInterview;

public class StackUsingLL {

    private LinkedListInterview data ;

    public void push(int item){
        data.addFirst(item) ;
    }

    public int pop() throws Exception {
       return data.removeFirst() ;
    }
    public int peek()throws Exception{
        return data.getFirst() ;
    }


 }
