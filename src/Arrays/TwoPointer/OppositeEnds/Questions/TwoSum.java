package Arrays.TwoPointer.OppositeEnds.Questions;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] numbers = {1 , 3 , 5,  4  , 8 };
        int target = 5 ;
        TwoSum t1  = new TwoSum();
        System.out.println(Arrays.toString(t1.twoSum(numbers , target)));

    }
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) return new int[]{left + 1, right + 1};
            else if (sum < target) left++;
            else right--;
        }
        return new int[]{-1, -1};
    }

}
