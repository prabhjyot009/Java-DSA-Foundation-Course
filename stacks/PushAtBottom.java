package stacks;

import java.util.Stack;

public class PushAtBottom {
    //in recursive way:
    public static void displayRecur(Stack<Integer> st,int ele){
        if(st.isEmpty()){
            st.push(ele);
            return;
        }
        int top=st.pop();
        displayRecur(st, ele);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        // System.out.println(st);
        // Stack<Integer> temp=new Stack<>();
        // while (st.size()>0) {
        //     int x=st.pop();
        //     temp.push(x);
        // }
        // System.out.println(temp);
        // st.push(6);
        // while (temp.size()>0) {
        //     int x=temp.pop();
        //     st.push(x);
        // }
        // System.out.println(st);
        displayRecur(st, 9);
        System.out.println(st);

    }
}
