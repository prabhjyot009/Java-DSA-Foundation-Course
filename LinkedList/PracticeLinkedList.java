package LinkedList;

import LinkedList.DeleteAtIndexLL.linkedlist;

public class PracticeLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class linkedlist{
        Node head=null;
        Node tail=null;
        int size=0;
        void insertAtEnd(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;
            }
            else{
                tail.next=temp;
            }
            tail=temp;
            size++;
        }
        void insertAtHead(int val){
            Node temp=new Node(val);
            if(head==null){
                head=tail=temp;
            }
            else{
                temp.next=head;
                head=temp;
            }
            size++;
        }
        void insertAt(int idx,int val){
            Node t=new Node(val);
            Node temp=head;
            if(idx==0){
                insertAtHead(val);
                return;                
            }
            else if(idx==size){
                insertAtEnd(val);
                return;
            }
            else if(idx<0 || idx>size){
                System.out.println("Wrong input");
                return;                
            }
            for (int i = 1; i <= idx-1; i++) {
                temp=temp.next;
            }     
            t.next=temp.next;
            temp.next=t;
            size++;
        }  
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        linkedlist ll=new linkedlist();
        ll.insertAtEnd(1);
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        ll.insertAtEnd(4);
        ll.insertAtHead(0);
        ll.insertAt(2,23);
        ll.display();
        System.out.println(ll.size);

    }
}
