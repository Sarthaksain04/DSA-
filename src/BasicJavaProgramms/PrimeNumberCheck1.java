package BasicJavaProgramms;

public class PrimeNumberCheck1 {
    public static void main(String[] args) {
        boolean isprime = true;
        int num = 17;
        for (int i = 2; i <Math.sqrt(num) ; i++) {
            if (num % i == 0){
                isprime = false;
                break;

            }
        }
        System.out.println(isprime);
    }
}
