package BasicJavaProgramms;

public class ReverseInt2 {
    public static void main(String[] args) {
        int num = 1234;
        String str = String.valueOf(num);
        char[]chars = str.toCharArray();

        int left = 0 ;
        int right = chars.length -1 ;

        while(left < right){
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        int reversed = Integer.parseInt(new String(chars));
        System.out.println(reversed);
    }
}
