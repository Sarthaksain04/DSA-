package StackAndQueue.Stack.Prefix;

import java.util.Stack;

public class PrefixEvaluation {
    public static void main(String[] args) {
        String Str = "-9/*+5346";
        Stack<Integer> val = new Stack<>();
        for (int i = Str.length() - 1; i >= 0; i--) {
            char ch = Str.charAt(i);
            int ascii = ch - '0';
            if (ascii >= 0 && ascii <= 9) {
                val.push(ascii);

            } else {
                int v1 = val.pop();
                int v2 = val.pop();
                if (ch == '-') val.push(v1 - v2);
                if (ch == '+') val.push(v1 + v2);
                if (ch == '/') val.push(v1 / v2);
                if (ch == '*') val.push(v1 * v2);
            }
        }

     System.out.println(val.peek());
    }
}
