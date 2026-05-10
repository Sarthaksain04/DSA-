package BitManipulation.Question;

public class TurnOff {

        public static void main(String[] args) {
            int n = 508;
            int k = 3;
            System.out.println(ClearKthbit(n , k )) ;
        }
        static int ClearKthbit(int n , int k ){

            return (n & (~(1 << k)));
        }
    }


