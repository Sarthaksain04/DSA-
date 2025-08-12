package BasicJavaProgramms;

public class ReverseString2 {
    public static void main(String[] args) {
        String str = "Sarthak";
        char[] chars  = str.toCharArray();
        int left = 0 ;
        int right = chars.length -1 ;

        while(left < right){
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }
        for (char c : chars){
            System.out.print(c);
        }
    }
}
