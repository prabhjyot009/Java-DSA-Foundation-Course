package LinkedList;

public class RecursiveDisplayLinkedList {
    static void displayrecursive(Node head){
        if(head==null) return;
        displayrecursive(head.next); //for reverse linked list
            System.out.print(head.data+" ");
            // displayrecursive(head.next);
    }

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
        // display(a);
        // System.out.println();
        // display(a);
        // System.out.println(); 
        displayrecursive(a);
    }
}
