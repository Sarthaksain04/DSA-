package Arrays.TwoPointer.OppositeEnds.Questions;

import java.util.Arrays;

public class CountPairs {
    public static void main(String[] args) {
        int[] nums = {2 , 1 , 3 , 5 , 8};
        int k = 5 ;
        Arrays.sort(nums);
        int left = 0 ;
        int right = nums.length - 1;
        int count = 0;

        while(left < right){
            if (nums[left] + nums[right] < k ){
                count += (right - left );
                left++;
            }
            else {
                right--;
            }
        }
        System.out.println(count);
    }
}
