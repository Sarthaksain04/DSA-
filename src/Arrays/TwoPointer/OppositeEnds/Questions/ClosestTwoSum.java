package Arrays.TwoPointer.OppositeEnds.Questions;

public class ClosestTwoSum {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 7, 10};
        int target = 15;
        int left = 0, right = nums.length - 1;
        int closestSum = Integer.MAX_VALUE, ansL = -1, ansR = -1;

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
                closestSum = sum;
                ansL = nums[left];
                ansR = nums[right];
            }
            if (sum < target) left++;
            else right--;
        }
        System.out.println("Closest pair: " + ansL + ", " + ansR);
    }
}
