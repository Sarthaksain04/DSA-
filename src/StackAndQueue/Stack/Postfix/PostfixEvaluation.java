package StackAndQueue.Stack.Postfix;

import java.util.Stack;

public class PostfixEvaluation {
    public static void main(String[] args) {
           String str = "953+4*6/-";
           Stack<Integer> val = new Stack<>();
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            int ascii = ch - '0';
            if(ascii >= 0 && ascii<= 9){
                val.push(ascii);
            }
            else{
                int v2 = val.pop();
                int v1 = val.pop();
                if (ch =='-') val.push(v1 - v2);
                if (ch =='+') val.push(v1 + v2);
                if (ch =='/') val.push(v1 / v2);
                if (ch =='*') val.push(v1 * v2);
            }
        }
        System.out.println(val.peek());
    }
}
