package LinkedList;

public class implementationLL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class linkedlist{ //data structure
        Node head=null; //user defined dataype
        Node tail=null;
        //creating function insert at end:
        void insertAtEnd(int val){
            Node temp=new Node(val);
            if(head==null){//empty list
                head=temp; 
            }
            else{
                tail.next=temp;  //head
                // tail=temp; //we remove this from here because it is redundant
            }
            tail=temp; //we will use this here because it will apply to both if and else statement
        }
        //insert at beginning:
        void insertAtHead(int val){
            Node temp=new Node(val);
            if(head==null){
                // head=tail=temp;
                //or
                insertAtEnd(val);
            }
            else{ //non empty list
                temp.next=head;  //next head will be displayed 
                head=temp;
            }
        }
        //for display:
        void display(){  //no need of parameter here(Node head)
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
        ll.insertAtEnd(4); // 4 
        ll.display();
        ll.insertAtEnd(5); // 4 -> 5 
        ll.display();
        ll.insertAtEnd(12);
        ll.display();
        ll.insertAtHead(0);
        ll.display();
    }
}
