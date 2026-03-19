package RecursionandBacktracking.Recursion.clearDoubtonSubsetSubsequencePermutationandCombination;

public class Doubt {
    public static void main(String[] args) {
        System.out.println("Subset of String : ");
        subsetOfstring("" , "abc");
        System.out.println();

        System.out.println("\n"+"Subset of Array : ");
        int[]arr = {1 , 2 , 3};
        subsetOfArray("" , arr , 0);
        System.out.println();

        System.out.println("\n"+"Subsequence of String : ");
        subsequenceofString("" , "abc");
        System.out.println();

        System.out.println("\n"+"Subsequence of Array : ");
        int[]arr1 = {1 , 2 , 3};
        subsequenceOfArray("" , arr , 0);
        System.out.println();

        System.out.println();
        System.out.println("permutation : ");
        permutation("" , "abc");
        System.out.println();





    }
    static void subsetOfstring(String p , String up){
          if (up.isEmpty()){
              System.out.print(p+" ");
              return;
          }
          char ch = up.charAt(0);
          subsetOfstring(p + ch , up.substring(1));
          subsetOfstring(p,up.substring(1));

    }
    static void subsetOfArray(String p , int[] arr , int index){
            if (index == arr.length) {
                System.out.print("["+p+"]");
                return;
        }
        subsetOfArray( p + arr[index] + " ", arr , index +1);
        subsetOfArray(p , arr , index+1);
    }

    static void subsequenceofString(String p , String up){
        if (up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        char ch = up.charAt(0);
        subsequenceofString(p + ch , up.substring(1));
        subsequenceofString(p,up.substring(1));
    }

    static void subsequenceOfArray(String p , int[] arr , int index){
        if (index == arr.length) {
            System.out.print("["+p+"]");
            return;
        }
        subsequenceOfArray( p + arr[index] + " ", arr , index +1);
        subsequenceOfArray(p , arr , index+1);
    }


    static void permutation(String p , String up){
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        char ch = up.charAt(0);

        for (int i = 0 ;  i <= p.length() ; i++){
            String f = p.substring(0,i);
            String s = p.substring(i , p.length());
            permutation(f+ ch + s , up.substring(1));
        }
    }



}



