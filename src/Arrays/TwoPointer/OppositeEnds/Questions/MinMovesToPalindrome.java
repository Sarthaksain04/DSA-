package Arrays.TwoPointer.OppositeEnds.Questions;

public class MinMovesToPalindrome {
    public static void main(String[] args) {
        String s = "mamad";
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;
        int swaps = 0;

        while (left < right) {
            if (arr[left] == arr[right]) {
                left++;
                right--;
            } else {
                int k = right;
                while (k > left && arr[k] != arr[left]) k--;
                if (k == left) {
                    char temp = arr[k];
                    arr[k] = arr[k + 1];
                    arr[k + 1] = temp;
                    swaps++;
                } else {
                    for (int i = k; i < right; i++) {
                        char temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;
                        swaps++;
                    }
                    left++;
                    right--;
                }
            }
        }

        System.out.println("Minimum swaps to make palindrome: " + swaps);
    }
}

