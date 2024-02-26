package stacks;

import java.util.Stack;

public class InsertAtBottom {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        int idx=0;
        int x=7;
        Stack<Integer> bt=new Stack<>();
        while (st.size()>idx) {
            bt.push(st.pop());
        }
        System.out.println(bt);
        st.push(x);
        while (bt.size()>0) {
            st.push(bt.pop());
        }
        System.out.println(st);
    }
}
