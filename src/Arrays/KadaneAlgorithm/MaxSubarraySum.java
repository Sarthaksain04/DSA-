package Arrays.KadaneAlgorithm;

public class MaxSubarraySum {
    public static void main(String[] args) {
        int[] arr = {3, -4, 5, 4, -1, 7, -8};
        int maxsum = 0;
        for (int start = 0; start < arr.length; start++) {
            int currSum = 0;
            for (int end = start; end < arr.length; end++) {
                currSum = arr[end] + currSum;
                maxsum = Math.max(currSum, maxsum);

            }

        }
        System.out.println(maxsum);
    }

}
