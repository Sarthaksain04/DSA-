package BasicJavaProgramms;

public class ReverseInt {
    public static void main(String[] args) {
        int num = 1234;
        int reversed = 0;
        while(num!= 0){
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num /10;
        }
        System.out.println(reversed);
    }
}
