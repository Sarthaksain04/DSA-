package SortingAndSearchingAlgorithms.Searching.LinearSearch.Question;

public class SearchinginString {
    static  boolean search1(String[]arr , String target){
        for (int i = 0; i < arr.length ; i++) {
             if (arr[i].equals(target)){
                 return true;
             }
        }
        return false;
    }

    static  boolean search2(String word , char target){
        for (int i = 0; i < word.length() ; i++) {
            if (word.charAt(i) == target){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
         String[] arr = {"apple","mango","banana"};
         boolean ans  = search1(arr , "mango");
         System.out.println(ans);

         String word = "mango";
         boolean ans2 = search2(word , 'a');
        System.out.println(ans2);

    }
}
