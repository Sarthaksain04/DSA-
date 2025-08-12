package Arrays.TwoPointer.SameDirection.Questions;
import java.util.*;

public class SeparateEvenOdd {
    public static void main(String[] args) {
        int[] nums = {12, 17, 70, 15, 22, 65, 21, 90};
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        for (int num : nums) {
            if (num % 2 == 0) even.add(num);
            else odd.add(num);
        }

        even.addAll(odd);
        System.out.println("Separated: " + even);
    }
}
