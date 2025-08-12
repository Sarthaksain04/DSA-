package String.Leetcode;

class Solution{
   public int  length(String s ){
       String Word = s.trim();
       int count = 0;
       for (int i = Word.length() - 1 ; i >= 0 ; i--) {
           if (Word.charAt(i) != ' '){
               count++;
           }
           else{
               break;
           }
       }
   return count ;
   }

}

public class LengthofLastWord {
    public static void main(String[] args) {
        String s = "How are you sarthak" ;
        Solution l = new Solution();
        System.out.println(l.length(s));
    }
}
