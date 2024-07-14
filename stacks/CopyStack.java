package stacks;

import java.util.Scanner;
import java.util.Stack;

public class CopyStack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        // Scanner sc=new Scanner(System.in);
        // int n;
        // System.out.println("Enter number of elements you want to enter:");
        // n=sc.nextInt();
        // System.out.println("Enter the elements");
        // for(int i=0;i<n;i++){
        //     int x=sc.nextInt();
        //     st.push(x);
        // }
        st.push(1);
        st.push(2)
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        //reverse order
        Stack<Integer> rt=new Stack<>();
        while(st.size()>0){
            // int x=st.peek();
            // rt.push(x);
            // st.pop();
            //or 
            rt.push(st.pop());
        }
        System.out.println(rt);
        //copying elements 
        Stack<Integer> gt=new Stack<>();
        while (rt.size()>0) {
            gt.push(rt.pop());
        }
        System.out.println(gt);
    }
}
