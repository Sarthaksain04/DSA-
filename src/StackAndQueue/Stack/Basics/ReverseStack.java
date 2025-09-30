package StackAndQueue.Stack.Basics;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        // Reversing a Stack
        Stack<Integer> st2  = new Stack<>();
        while(st.size() > 0 ){
//             int x = st.peek();
//             st2.push(x);
//             st.pop();

//       Method2
            st2.push(st.pop());
        }
        System.out.println(st2);

    }
}

//  In This i reverse a Stack By user input
//package StackAndQueue.Stack.Basics;
//
//import java.util.Stack;
//import java.util.*;
//public class CopyStackinSameOrder {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Stack<Integer> st = new Stack<>();
//        int n;
//        System.out.println("Enter the number of  Elements:  ");
//        n = sc.nextInt();
//        System.out.println("Enter the elements : ");
//        for (int i = 1; i <= n; i++) {
//            int x = sc.nextInt();
//            st.push(x);
//
//        }
//        System.out.println(st);
//
//        Stack<Integer> st2 = new Stack<>();
//        while (st.size() > 0) {
//            st2.push(st.pop());
//        }
//        System.out.println(st2);
//
//
//    }
//}
