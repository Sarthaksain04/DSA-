package RecursionandBacktracking.Recursion.StringQuestion;

public class SkipCharacter {
    public static void main(String[] args) {
          String str = "baccad";
        System.out.println(skip(str , 0));

    }

    static String skip(String str ,int i){
           if (str.length() == i){
               return "" ;
           }
          if (str.charAt(i) == 'a'){
              return skip(str, i + 1);
          }
          else {
              return str.charAt(i) + skip(str, i + 1);
          }

    }
}
