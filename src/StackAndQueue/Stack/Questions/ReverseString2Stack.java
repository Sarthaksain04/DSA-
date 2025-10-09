package StackAndQueue.Stack.Questions;

import java.util.Stack;

public class ReverseString2Stack {
    public static void main(String[] args) {
        String str = "HELLO";
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        for (int i = 0; i < str.length() ; i++) {
             st1.push(str.charAt(i));

        }
        while(st1.size() > 0){
             st2.push(st1.pop());
        }
        System.out.println(st2);
    }
}
