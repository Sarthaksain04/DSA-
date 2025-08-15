package String.Basics;

public class StringToChar {
    public static void main(String[] args) {
        String name = "Java";
        char[] chars = name.toCharArray();
        for(char c : chars) {
            System.out.print(" " +c);
        }

    }
}
