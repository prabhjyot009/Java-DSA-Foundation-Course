package LinkedList;

public class Basics {
    public static class Node {
        int data;
        Node next;// address of next

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        // Node x = new Node();
        // System.out.println(x);
        // System.out.println(x.next);

        Node a = new Node(5);
        System.out.println(a.next);// null
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
        /*
         * a.next=b;//a.next me b node ka address.
         * System.out.println(a);//$Node@5acf9800
         * System.out.println(a.next);//$Node@4617c264
         * System.out.println(b);//$Node@4617c264
         * System.out.println(c);//$Node@36baf30c
         * 
         * System.out.println(a.data);
         * System.out.println(a.next.data);
         */

        // 5 3 9 8 16
        a.next = b;// 5 -> 3 9 8 16
        b.next = c;// 5 -> 3 -> 9 8 16
        c.next = d;// 5 -> 3 -> 9 -> 8 16
        d.next = e;// 5 -> 3 -> 9-> 8-> 16 

        System.out.println(a.data);
        System.out.println(a.next.data);
    }
}
