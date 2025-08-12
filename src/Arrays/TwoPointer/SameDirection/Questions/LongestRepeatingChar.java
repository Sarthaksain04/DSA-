package Arrays.TwoPointer.SameDirection.Questions;

public class LongestRepeatingChar {
    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
        int[] freq = new int[26];
        int maxFreq = 0, left = 0, result = 0;

        for (int right = 0; right < s.length(); right++) {
            freq[s.charAt(right) - 'A']++;
            maxFreq = Math.max(maxFreq, freq[s.charAt(right) - 'A']);

            while (right - left + 1 - maxFreq > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            result = Math.max(result, right - left + 1);
        }

        System.out.println("Max Length: " + result);
    }
}
