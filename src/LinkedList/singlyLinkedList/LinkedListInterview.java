package LinkedList.singlyLinkedList;

public class LinkedListInterview {
     Node head ;
     Node tail ;
    int size ;
   //creating a linkedListNode
     class Node{
        int val ;
        Node next;

        Node(int val){
            this.val = val ;
            this.next = null ;
        }
    }
    //GetSize //tc -> O(1)
    public int Size(){
        return  this.size ;
    }
    //GetFirst element in LinkedList TC-> O(1)
    public int getFirst()throws Exception{
        if(this.head == null){
            throw new Exception("the size of linkedList is zero") ;
        }
        else{
            return this.head.val ;
        }
    }
    //getLast O(1)
    public int getLast()throws Exception{
        if(this.size == 0){
            throw new Exception("the size of linkedList is zero") ;
        }
        else{
            return this.tail.val ;
        }
    }
    //getAt given index [ TC -> o(N)]
    public int getAt(int index)throws Exception{
        if(this.size == 0 ){
            throw new Exception("Size of linkedList is 0");
        }
        if(index<0 || index>=this.size){
            throw new Exception("Index out of bound"+"Index :" + index+" Size: "+this.size) ;
        }
        Node temp = this.head ;
        while(index-- != 0){
             temp = temp.next;
        }
        return temp.val ;
    }
    //addFirst
    public void addFirst(int data){
        Node newNode = new Node(data) ;
        if(this.size==0){
            this.head = newNode ;
            this.tail = newNode ;
            this.size = 1 ;
        }
        else{
            newNode.next = this.head ;
            this.head = newNode ;
            this.size += 1 ;
        }
    }
    //addLast TC->O(1)
    public void addLast(int data){
        Node newNode = new Node(data) ;
        if(this.size == 0){
            this.head = newNode ;
            this.tail = newNode ;
            this.size = 1 ;
        }
        else{
            this.tail.next = newNode ;
            this.tail = newNode ;
            this.size += 1 ;
        }
    }
    //addAt
    public void addAt(int index , int data)throws Exception{
        //add first for index 0
        if(index == 0){
            this.addFirst(data);
            return;
        }
        //add last for index==size
        if(index == this.size){
            this.addLast(data);
            return;
        }
        //linear check for index out of bound if size less than 0 and
        if(index<0 || index > this.size){
            throw new Exception("Index out of bound"+"Index :" + index+" Size: "+this.size) ;
        }
        //if need add in middle
        Node newNode = new Node(data) ;
        Node previousNode = getNodeAt(index-1) ;
        newNode.next = previousNode.next ;
        previousNode.next = newNode ;
        this.size += 1 ;

    }
    public Node getNodeAt(int index)throws Exception{
        if(this.size == 0 ){
            throw new Exception("Size of linkedList is 0");
        }
        if(index<0 || index>=this.size){
            throw new Exception("Index out of bound"+"Index :" + index+" Size: "+this.size) ;
        }
        Node temp = this.head ;
        while(index-- != 0){
            temp = temp.next;
        }
        return temp ;
    }

    public int removeFirst()throws  Exception{
        if(this.size == 0){
            throw new Exception("linked-list size is zero how u can del first") ;
        }
        int removedElement = this.head.val ;
        if(this.size == 1){
            this.head = null ;
            this.tail = null ;
            this.size = 0 ;
        }
        else{
            this.head = this.head.next ;
            this.size -= 1 ;
        }
        return  removedElement ;
    }
    public int removeLast()throws Exception{
        if(this.size == 0){
            throw new Exception("linked-list size is zero how u can del first") ;
        }
        int removedValue = this.tail.val ;
        if(this.size == 1 ){
            this.head= this.tail = null ;
            this.size = 0 ;
        }
        else{
            Node currentNode = getNodeAt(this.size-2) ;
            currentNode.next = null ;
            this.tail = currentNode ;
            this.size -= 1 ;
        }
        return removedValue ;
    }
    //removeAt
    public int removeAt(int index)throws Exception{
        if(this.size == 0){
            throw new Exception("linked-list size is zero how u can del first") ;
        }
        if(index<0 || index>=this.size){
            throw new Exception("Index out of bound"+"Index :" + index+" Size: "+this.size) ;
        }
        if(index == 0 ){
            return this.removeFirst() ;

        }
        else if(index == this.size-1){
            return  this.removeLast() ;

        }else {
            Node previousNodeOfIndex = getNodeAt(index-1) ;
            int removedValue = previousNodeOfIndex.next.val ;
            Node afterIndexNode = getNodeAt(index+1 );
            previousNodeOfIndex.next = afterIndexNode ;
            this.size -= 1 ;
            return  removedValue ;
        }
    }
    public void deleteAll(){
        this.head = null ;
        this.tail = null ;
        this.size = 0 ;
    }
    //display the linkedList - [tc->o(n)]
    public void displayList(){
        Node temp = this.head ;
        while(temp != null){
            System.out.print(temp.val +"->");
            temp = temp.next ;
        }
        System.out.println("null");
    }

}
