package Arrays.TwoPointer.FastandSlow.Questions;

public class RemoveDuplicatesII {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 3, 3};
        int index = 2;

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[index - 2]) {
                nums[index++] = nums[i];
            }
        }

        for (int i = 0; i < index; i++)
            System.out.print(nums[i] + " ");
    }
}
