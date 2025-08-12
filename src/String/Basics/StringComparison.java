package String.Basics;

public class StringComparison {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        System.out.println(s1 == s2);   // true (same reference from pool)
        System.out.println(s1 == s3);   // false (new object)
        System.out.println(s1.equals(s3)); // true (same value)

    }
}
