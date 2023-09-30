package LinkedList;

import LinkedList.implementationLL.linkedlist;

public class InsertMethodLL {

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
        void insertAtEnd(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;
            }
            else{
                tail.next=temp;
            }
            tail=temp;
        }
        void insertAtHead(int val){
            Node temp=new Node(val);
            if(head==null){
                insertAtEnd(val);
            }
            else{
                temp.next=head;
                head=temp;
            }
        }
        void insertAt(int idx,int val){
            Node t=new Node(val);
            Node temp=head;
            if(idx==size()){
                insertAtEnd(val);
                return;
            }
            else if(idx==0){
                insertAtHead(val);
                return;
            }
            else if(idx<0 ||idx>size()){
                System.out.println("wrong index");
                return;
            }
            for (int i = 1; i <=idx-1; i++) { //means it will run till given idx -1
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        int size(){
            Node temp=head;
            int count=0;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        linkedlist ll=new linkedlist();
        ll.insertAtEnd(0);
        ll.insertAtEnd(1);
        ll.insertAtEnd(2);
        ll.insertAtHead(-1);
        ll.insertAt(2,12);
        ll.insertAt(0, 100); //did not work because
        ll.display();
        System.out.println(ll.size());
        // System.out.println(ll.tail.data);
    }
}
