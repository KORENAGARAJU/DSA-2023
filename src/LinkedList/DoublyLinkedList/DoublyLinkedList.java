package LinkedList.DoublyLinkedList;

public class DoublyLinkedList {
    Node head ;
    Node tail ;
    int size ;

    private class Node{
        int val ;
        Node next ;
        Node prev ;

        Node(int val) {
            this.val = val;
            this.next = null;
            this.prev = null ;

        }
    }
    DoublyLinkedList(){

    }

    public int Size(){
        return  this.size ;
    }

    public void addFirst(int data){
        Node newNode = new Node(data) ;
        if(this.size == 0){
            this.head = newNode ;
            this.tail = newNode ;
            this.size = 1 ;
        }
        else{
            newNode.next = this.head ;
            this.head.prev = newNode ;
            this.head = newNode ;
            this.size += 1 ;
        }
    }
    public void addLast(int data){
        Node newNode = new Node(data) ;
        if(this.size == 0){
            this.head = newNode ;
            this.tail = newNode ;
            this.size = 1 ;
        }
        else{
            this.tail.next = newNode ;
            newNode.prev = this.tail ;
            this.tail = newNode ;
            this.size += 1 ;
        }
    }
    public void addAt(int index , int data)throws Exception{
        if(index == 0){
            this.addFirst(data);
            return;
        }
        if(index == this.size){
            this.addLast(data);
            return;
        }
        if(index<0 || index > this.size){
            throw new Exception("Index out of bound"+"Index :" + index+" Size: "+this.size) ;
        }
        Node newNode = new Node(data) ;
        Node previousNode = getNodeAt(index-1) ;
        Node previousNodeNext = previousNode.next ;

       //1.
        previousNode.next = newNode ;
        //2.
        newNode.prev = previousNode ;
        //3.
        previousNodeNext.prev = newNode ;
        //4.
        newNode.next = previousNodeNext ;
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

    public void display(){
            Node temp = this.head ;
            while(temp != null){
                System.out.print(temp.val +"->");
                temp = temp.next ;
            }
            System.out.println("null : left to right") ;
    }
    public void displayReverse(){
        Node temp = this.tail ;
        while (temp != null){
            System.out.print(temp.val + "->");
            temp = temp.prev ;
        }
        System.out.println("null : right to left");

    }
}
