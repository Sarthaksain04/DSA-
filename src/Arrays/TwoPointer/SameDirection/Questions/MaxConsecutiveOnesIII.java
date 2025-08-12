package Arrays.TwoPointer.SameDirection.Questions;

public class MaxConsecutiveOnesIII {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 0, 1, 1, 1, 0};
        int k = 2;
        int left = 0, zeros = 0, maxLen = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) zeros++;
            while (zeros > k) {
                if (nums[left++] == 0) zeros--;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }

        System.out.println("Max Length: " + maxLen);
    }
}
