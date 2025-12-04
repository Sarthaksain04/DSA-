package StackAndQueue.Stack.Questions;

import java.util.*;

         class Solution {
             public String removeDuplicateLetters(String s) {
                 StringBuilder sb = new StringBuilder();
                 Stack  <Character> st = new Stack<>();
                 boolean[] inStack = new boolean[26];
                 int[] freq = new int[26];

                 for (char ch : s.toCharArray()) {
                     freq[ch - 'a']++;
                 }
                 for(char ch : s.toCharArray()){
                     int index = ch - 'a';
                     freq[index]--;

                     if (!inStack[index]){
                         while (!st.isEmpty() && st.peek() > ch && freq[st.peek() - 'a'] > 0) {
                             char top = st.pop();
                             inStack[top - 'a'] = false;
                         }
                         st.push(ch);
                         inStack[index] = true;


                     }

                 }

                 while (!st.isEmpty()) {
                     sb.insert(0, st.pop());
                 }

                 return sb.toString();
             }
         }



public class RemoveDuplicate {
    public static void main(String[] args) {

        String s = "cbacdcbc";
        Solution s1 = new Solution();
        String result = s1.removeDuplicateLetters(s);
        System.out.println(result);

    }
}
