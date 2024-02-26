package stacks;

import java.util.Stack;

public class RecursiveDisplay {
    public static void displayRecur(Stack<Integer> st){
        if(st.size()==0) return;
        int top=st.pop();
        System.out.print(top+" ");
        displayStack(st);
        st.push(top);
        
    }
    public static void displayStack(Stack<Integer> st){
        if(st.size()==0) return;
        int top=st.pop();
        displayStack(st);
        System.out.print(top+" ");
        st.push(top);
        
    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        displayRecur(st);
        System.out.println();
        displayStack(st);
    }
}
