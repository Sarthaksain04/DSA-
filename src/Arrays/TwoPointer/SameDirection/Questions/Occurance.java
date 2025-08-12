package Arrays.TwoPointer.SameDirection.Questions;
import java.util.*;

public class Occurance {
    public static void main(String[] args) {
        int[] nums = {5, 2, 7, 2, 4, 2, 9};
        int target = 2;
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) result.add(i);
        }

        System.out.println("Indices: " + result);
    }
}
