package Arrays.TwoPointer.FastandSlow.Questions;

import java.util.Arrays;

public class RemoveDuplicatesSorted {
    public static void main(String[] args) {


        int[] nums = {1, 1, 2, 2, 3};
        int i = 0;

        for (int j = 1; j < nums.length ; j++) {
            if (nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];

            }
        }
        int num = i+1;
        for (int k = 0; k < num; k++) {
            System.out.print(nums[k] + " ");
        }
    }
}

