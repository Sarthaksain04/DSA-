package Arrays.TwoPointer.OppositeEnds.Questions;

public class Palindrome {
    public static void main(String[] args) {
        int[] nums = {1 , 2 , 1};
        int left = 0;
        int right = nums.length -1 ;
        while(left < right) {
            if (nums[left] != nums[right]) {
                System.out.println(" not palindrome");
                return;
            }
            left++;
            right--;
        }
        System.out.println(" palindrome");

             }

        }


