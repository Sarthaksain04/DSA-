package StackAndQueue.Stack.Basics.Underflow;

import java.util.Stack;

public class Under1 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop(); //Here it give an error because i am popping an element form an empty stack : Underflow Condiion
        System.out.println(st);
    }
}
