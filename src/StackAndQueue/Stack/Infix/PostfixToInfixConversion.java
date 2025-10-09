package StackAndQueue.Stack.Infix;

import java.util.Stack;

public class PostfixToInfixConversion {
    public static void main(String[] args) {
        String str = "953+4*6/-";
        Stack<String> val = new Stack<>();
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            int ascii = ch - '0';
            if(ascii >= 0 && ascii<= 9){
                val.push(ch+ "");
            }
            else{
                String v2 = val.pop();
                String v1 = val.pop();
                char op = ch;

                String t = "(" + v1 + op + v2 + ")" ;
                val.push(t);
            }
        }
        System.out.println(val.peek());
    }
}
