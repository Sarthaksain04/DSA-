package StackAndQueue.Stack.Questions;

import java.util.Stack;

public class BalancedParantheses {
    public static void main(String[] args) {
           String str = "{[()]}";
           Stack<Character> st1 = new Stack<>();
           boolean isBalanced = true;

        for (int i = 0; i < str.length(); i++) {
            char val = str.charAt(i);
            if(val == '{' || val == '[' || val == '('){
                st1.push(val);
            } else if ( val == '}' || val == ']' || val == ')') {
                if (st1.isEmpty()){
                    isBalanced = false;
                    break;
                }
                char top = st1.pop();
                if ((val == ')' && top != '(') || (val == ']' && top != '[') || (val == '}' && top != '{')) {
                    isBalanced = false;
                    break;

                }
            }
        }
        if (!st1.isEmpty()) {
            isBalanced = false;
        }
        System.out.println(isBalanced ? "Balanced" : "Not Balanced");    }
}
