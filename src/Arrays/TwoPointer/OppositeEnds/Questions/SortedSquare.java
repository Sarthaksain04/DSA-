package Arrays.TwoPointer.OppositeEnds.Questions;

import java.util.Arrays;

class Sorted{
   public   int[] sortedsquare(int[] nums){
         int n = nums.length;
         int[] result = new int[n];
         int left = 0;
         int right = n-1 ;
         int pos = n -1 ;


       while (left <= right) {
           int leftSq = nums[left] * nums[left];
           int rightSq = nums[right] * nums[right];
           if (leftSq > rightSq) {
               result[pos--] = leftSq;
               left++;
           } else {
               result[pos--] = rightSq;
               right--;
           }
       }

       return result;
    }

}

public class SortedSquare {
    public static void main(String[] args) {
        int [] nums = {1 , 2 , 4, 5};
        Sorted s1 = new Sorted();

        System.out.println(Arrays.toString( s1.sortedsquare(nums)));
    }

}
