package Arrays.TwoPointer.OppositeEnds.Questions;

public class Targetsum {
    public static void main(String[] args) {
        int[] nums = {1 , 2  , 3 , 4 , 5, 6};
        int target = 4 ;
        int left = 0;
        int right = nums.length - 1;

        while(left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                System.out.println(nums[left] + "" + nums[right]  );
                break;
            }
            else if (sum < target) {
                left++ ;

            }
            else {
                right--;
            }

        }

    }
}
