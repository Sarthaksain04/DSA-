package StackAndQueue.Stack.Questions;
import java.util.*;

public class ReverseString1StackMethod2 {
    public static void main(String[] args) {
           String str = "HELLO";
           Stack<Character> st = new Stack<>();

        // Step 1: Push all characters into the stack
        for (int i = 0; i < str.length(); i++) {
            st.push(str.charAt(i));
        }
        // Step 2: Pop characters from the stack to build reversed string
        String reversed = "";
        while (!st.isEmpty()) {
            reversed += st.pop(); // pop returns top element
        }
        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reversed);
    }
}
