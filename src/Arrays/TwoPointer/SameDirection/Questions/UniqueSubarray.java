package Arrays.TwoPointer.SameDirection.Questions;

import java.util.HashSet;
import java.util.Set;

public class UniqueSubarray {
    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 1, 2, 3, 4};
        Set<Integer> set = new HashSet<>();
        int left = 0 ;
        int maxLen = 0 ;
        for (int right = 0 ; right < nums.length; right++){
            while(set.contains(nums[right])){
                set.remove(nums[left++]);
            }
            set.add(nums[right]);
            maxLen = Math.max(maxLen, right - left + 1);
        }

        System.out.println("Longest Unique Subarray: " + maxLen);
    }
}
