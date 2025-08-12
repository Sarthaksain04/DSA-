package Arrays.TwoPointer.SameDirection.Questions;

public class SortedAndRotated {
    public static void main(String[] args) {
        int [] nums = {3 , 4 , 5 , 1 , 2};
        int count = 0;

        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] > nums[(i + 1) % nums.length]){
                count++;
            }
        }
        System.out.println(count <= 1 ? " yes" : "No");
    }
}
