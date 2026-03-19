package RecursionandBacktracking.Recursion.Assesment1;

public class MinandMax {
    public static void main(String[] args) {
        int[] arr = { 1 , 4 , 3 , -5,  -4, 8, 6 };
        System.out.println(Max(arr, 0));
        System.out.println(Min(arr , 0));

    }


    static int Max(int[] arr , int i ){

          if (arr.length - 1 == i){
              return arr[i];
          }
          int curr = Max(arr , i+ 1);

          if (arr[i] < curr){
              return curr;
          }
          else{
              return arr[i] ;
          }
    }




    static int Min(int[] arr , int i ){

        if (arr.length - 1 == i){
            return arr[i];
        }
        int curr = Min(arr , i+ 1);

        if (arr[i] < curr  ){
            return arr[i];
        }
        else{
            return curr ;
        }
    }
}
