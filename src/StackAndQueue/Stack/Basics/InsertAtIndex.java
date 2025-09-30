package StackAndQueue.Stack.Basics;

import java.util.Stack;

public class InsertAtIndex {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        int idx = 2 ;
        int x  = 7 ;

        Stack<Integer> st2 = new Stack<>();
        while(st.size() > idx){
            st2.push(st.pop());
        }
        st.push(x);
        while (st2.size() > 0){
               st.push(st2.pop());
        }
        System.out.println(st);
    }
}
