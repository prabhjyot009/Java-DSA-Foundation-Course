package LinkedList;

public class DisplayLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
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

        Node temp=a;
        for (int i = 1; i <= 5; i++) {
            System.out.print(temp.data+" ");
            temp=temp.next;            
        }        

        //better approach

        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;            
        }
    }
}
