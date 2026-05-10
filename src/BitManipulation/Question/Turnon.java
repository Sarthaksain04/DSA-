package BitManipulation.Question;

public class Turnon {
    public static void main(String[] args) {
       int n = 500;
       int k = 3;
        System.out.println(SetKthbit(n , k )) ;
    }
    static int SetKthbit(int n , int k ){

        return (n |(1 << k));
    }
}
