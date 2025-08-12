package BasicJavaProgramms;

public class ReverseString3 {
    public static void main(String[] args) {
        String str = "Sarthak";
        String reversed = "";
        for (int i = str.length() -1 ; i >= 0 ; i--) {
            reversed = reversed + str.charAt(i);
        }
        System.out.println(reversed);
    }
}
