package StackAndQueue.Stack.Basics;

import java.util.Stack;
import java.util.*;
public class CopyStackinSameOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n;
        System.out.println("Enter the number of  Elements:  ");
        n = sc.nextInt();
        System.out.println("Enter the elements : ");
        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            st.push(x);

        }
        System.out.println(st);

        Stack<Integer> st2 = new Stack<>();
        while (st.size() > 0) {
//            st2.push(st.pop());
            int x = st.peek();
             st2.push(x);
             st.pop();
        }
        System.out.println(st2);

        Stack<Integer> st3 = new Stack<>();
        while(st2.size() > 0){
              st3.push(st2.pop());
        }
        System.out.println(st3);
    }
}
