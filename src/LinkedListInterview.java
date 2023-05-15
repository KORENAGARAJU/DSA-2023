import org.w3c.dom.Node;

public class LinkedListInterview {
    public Node head ;
    public class Node{
        int val ;
        Node next ;
        Node(int val) {
            this.val = val;
            this.next = next;
        }
    }
    LinkedListInterview(){

    }
    public Node getHead(){
        return this.head ;
    }
    public void addFirst(int data){
        Node newNode = new Node(data) ;
        if(head == null){
            this.head = newNode;
        }
        else{
            newNode.next = this.head ;
            this.head = newNode ;
        }
    }
    public static Node mergeList(Node head1, Node head2){
        Node curr = head1.next ;
        Node prev = head1 ;
        while(curr != null && head2 != null){
            prev.next = head2 ;
            head2.next = curr ;
            prev = curr ;
            curr= curr.next ;
            head2 = head2.next;
        }
        if(head2 != null){
            prev.next = head2 ;
        }
        return head1 ;
    }
    public static void display(Node ans){
        while (ans != null){
            System.out.println(ans.val);
            ans = ans.next;
        }
    }
}
