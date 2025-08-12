package BasicJavaProgramms;

public class PrimeNumberCheck2 {
    public static void main(String[] args) {
        int num = 1234;
        String str = String.valueOf(num);
        int[] digits  = new int[str.length()];
        for (int i = 0; i < str.length() ; i++) {
            digits[i] = str.charAt(i) - '0';

        }
        for (int i = 0; i < digits.length; i++) {
            for (int j = i + 1; j < digits.length; j++) {
                int sum = digits[i] + digits[j];
                if (isPrime(sum)) {
                    System.out.println("Pair: (" + digits[i] + ", " + digits[j] + ") → Sum = " + sum + " is Prime");
                }
            }
        }
    }
        public static boolean isPrime(int n) {
            if (n <= 1)
                return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0)
                    return false;
            }
            return true;

        }

    }

