package stacks;

import java.util.Stack;

public class RemoveFromBottom {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        Stack<Integer> rt=new Stack<>();
        while(st.size()>1){
            int x=st.pop();
            rt.push(x);
        }
        System.out.println(rt);
        st.pop();
        while(rt.size()>0){
            int x=rt.pop();
            st.push(x);
        }
        System.out.println(st);
    }
}
