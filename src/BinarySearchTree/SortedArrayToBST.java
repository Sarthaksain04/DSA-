package BinarySearchTree;


class TreeNode5{
     int val ;
     TreeNode5 left ;
     TreeNode5 right ;

     TreeNode5(int val ){
          this.val = val;

     }
}

public class SortedArrayToBST {
    public static void main(String[] args) {
        int[] arr = {1 , 2 , 3 , 4 , 5 ,6 , 7};
        helper(arr);
    }

    public static void helper(int[]arr){


        Constructree(arr , 0 , arr.length - 1  );

    }

    public static TreeNode5 Constructree(int[]arr , int low , int high){
              if(low > high) return  null;

              int mid = low + (high  -  low)  /2 ;

              TreeNode5 root = new TreeNode5(arr[mid]);

              root.left =  Constructree(arr , 0 , mid - 1   );
              root.right =  Constructree(arr , mid + 1, arr.length - 1  );

              return  root ;

    }


}
