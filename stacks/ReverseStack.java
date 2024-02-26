package stacks;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
                Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        Stack<Integer> rt=new Stack<>();
        while(st.size()>0){
            int x=st.pop();
            rt.push(x);
        }
        System.out.println(rt);
        Stack<Integer> qt=new Stack<>();
        while(rt.size()>0){
            int x=rt.pop();
            qt.push(x);
        }
        System.out.println(qt);
        while (qt.size()>0) {
            st.push(qt.pop());
        }
        System.out.println(st);
    }
}
