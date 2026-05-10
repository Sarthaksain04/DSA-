package BitManipulation.Question;

public class PowerofTwo    {
    public static void main(String[] args) {
        int n = 98 ;
        System.out.println(isPwerofTwo(n));
        System.out.println(isPwerofTwo2(n));
    }

    public static boolean isPwerofTwo(int n ){
         if (n == 0 ) return false ;
         if (n == 1) return true;
         if (n%2 == 1) return false;
         return isPwerofTwo(n /2 );
    }
    public static boolean isPwerofTwo2(int n ){
         if (n == 0 ) return false ;
         while(n> 1 ){
             if (n % 2 == 1) return  false;
             n/=2 ;
         }
         return true;
    }
// return n > 0 && (n & (n - 1 )) == 0;
}
