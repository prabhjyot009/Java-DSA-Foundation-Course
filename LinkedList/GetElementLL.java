package LinkedList;

import LinkedList.InsertMethodLL.linkedlist;

public class GetElementLL {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class linkedlist {
        Node head = null;
        Node tail = null;
        int size=0;
        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
            size++;
        }

        void insertAtHead(int val) {
            Node temp = new Node(val);
            if (head == null) {
                insertAtEnd(val);
            }
            temp.next = head;
            head = temp;
            size++;
        }
        void insertAt(int idx,int val){
            Node t=new Node(val);
            Node temp=head;
            if(idx==size){
                insertAtEnd(val);
                return;
            }
            else if(idx==0){
                insertAtHead(val);
                return;
            }
            else if(idx>size || idx<0){
                System.out.println("Wrong index");
                return;
            }
            for (int i = 1; i <= idx-1; i++) {
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
            size++;
        }
        int getElement(int idx){
            if(idx<0 || idx>size){
                System.out.println("Wrong index");
                return -1;
            }
            Node temp=head;
            for (int i = 1; i <= idx; i++) {
                temp=temp.next;
            }
            return temp.data;
        }
        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
        // int size(){ O(n)
        //     Node temp=head;
        //     int count=0;
        //     while(temp!=null){
        //         count++;
        //         temp=temp.next;
        //     }
        //     return count;
        // }
    }


    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(0);
        ll.insertAtEnd(1);
        ll.insertAtEnd(2);
        ll.insertAtHead(0);
        ll.insertAt(0, -1);
        ll.display();
        System.out.println(ll.size); //we will remove size function because it is an attribute.
        System.out.println(ll.getElement(0));

    }
}
