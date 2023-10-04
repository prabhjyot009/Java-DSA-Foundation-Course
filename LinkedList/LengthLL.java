package LinkedList;

public class LengthLL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static int length(Node head){
        int count=0; 
        while(head!=null){
            count++;
            head=head.next; 
        }
        return count;
    }
    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(3);
        Node c=new Node(9);
        Node d=new Node(8);
        Node e=new Node(16);
        Node f=new Node(20);

        a.next=b; 
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        Node head=a;
        System.out.println(length(head));
    }
}
