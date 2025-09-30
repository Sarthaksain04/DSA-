package StackAndQueue.Stack.Basics;

import java.util.Stack;

public class InsertAtBottom {
    public static void main(String[] args) {
            Stack<Integer> st = new Stack<>();
            st.push(1);
            st.push(2);
            st.push(3);
            st.push(4);
            System.out.println(st);
            Stack<Integer> st2 = new Stack<>();
            while(st.size() > 0 ){
                 int x = st.peek();
                 st2.push(x);
                 st.pop();
            }
            System.out.println(st2);
        st.push(5);
        while (st2.size() > 0) {
            int x = st2.peek();
                st.push(x);
                st2.pop();
            }
        System.out.println(st);
    }
}
