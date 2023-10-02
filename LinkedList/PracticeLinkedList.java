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
        void deleteAt(int idx){
            Node temp=head;
            if(idx==0){
                head=head.next;
                size--;
                return;
            }
            for (int i = 0; i <=idx-1; i++) {
                temp=temp.next;
            }
            temp.next=temp.next.next;
            tail=temp;//if last index being removed then tail will point to temp 
                      //beacuse tail will be the last removed index and when it will 
                      //remove 4th index will direct to null (tail is still last index value).
            size--;
        }
        int getAt(int idx){
            Node temp=head;
            if(idx<0 || idx>size){
                System.out.println("Wrong input");
                return -1;                
            }
            for (int i = 1; i <= idx; i++) {
                temp=temp.next;
            }            
            return temp.data;
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
        System.out.println(ll.getAt(2));

    }
}
