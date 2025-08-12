package String.Leetcode;



public class RemoveDuplicateLetter {
    public static void main(String[] args) {
       String word = "abcbc";
       char[] ch = word.toCharArray();
        int left = 0 ;
        int right = ch.length - 1 ;
        for (int i = 0;  i < right  ; i++) {
            if(ch[left] != ch[right]){
                ch[right] = ch[left];
            left++;
            right--;


            }
        }
        for (int j = 0; j < right ; j++) {
            System.out.println(ch[j]);
        }
    }
}
