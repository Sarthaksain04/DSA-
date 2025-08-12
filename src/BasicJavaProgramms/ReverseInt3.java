package BasicJavaProgramms;

import java.util.*;

public class ReverseInt3 {
    public static void main(String[] args) {
        int num = 1234;
        Stack<Integer> stack = new Stack<>();

        while(num != 0 ){
            stack.push(num%10);
            num /= 10;
        }
        int reversed = 0 ;
        int multiplier = 1 ;
        while(!stack.isEmpty()){
            reversed += stack.pop() * multiplier;
            multiplier *= 10 ;
        }
        System.out.println(reversed);
    }
}
