package LinkedList;

public class InsertAtEndLL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    //if only head is given:
    public static void insertAtEnd(Node head,int val){
        Node temp=new Node(val);
        Node t=head;
        while(t.next!=null){//t.next jab null hogya iska matlab voh tail hai
            t=t.next;
        }
        t.next=temp; 
    }
    public static void display(Node head){  
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }


    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(3);
        Node c=new Node(9);
        Node d=new Node(8);
        Node e=new Node(16);

        a.next=b; 
        b.next=c;
        c.next=d;
        d.next=e;

        insertAtEnd(a,87);
        display(a);
    }
}
