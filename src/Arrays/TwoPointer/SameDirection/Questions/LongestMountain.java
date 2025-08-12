package Arrays.TwoPointer.SameDirection.Questions;

public class LongestMountain {
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 7, 3, 2, 5};
        int n = arr.length, maxLen = 0, i = 1;

        while (i < n - 1) {
            if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
                int left = i, right = i;
                while (left > 0 && arr[left - 1] < arr[left]) left--;
                while (right < n - 1 && arr[right] > arr[right + 1]) right++;
                maxLen = Math.max(maxLen, right - left + 1);
                i = right + 1;
            } else {
                i++;
            }
        }

        System.out.println("Longest Mountain Length: " + maxLen);
    }
}
