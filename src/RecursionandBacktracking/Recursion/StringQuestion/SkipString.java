package RecursionandBacktracking.Recursion.StringQuestion;

public class SkipString {
    public static void main(String[] args) {
        String str = "AppleisGreen";
        System.out.println(skip(str));

    }
    static String skip(String str){
        if (str.isEmpty()){
            return "" ;
        }

        if (str.startsWith("Apple")){
            return skip(str.substring(5));
        }
        else {
            return str.charAt(0) + skip(str.substring(1));
        }

    }

}
