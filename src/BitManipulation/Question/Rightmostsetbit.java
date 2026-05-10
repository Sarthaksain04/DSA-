package BitManipulation.Question;

public class Rightmostsetbit {
    public static void main(String[] args) {
//  first way
        int n = 6;
        System.out.println(setbit(n));
        System.out.println(setbit2(n));

    }
    static int setbit(int n ){
           return n  | ( n + 1);
    }

//    second way
    static  int setbit2(int n ){
          for (int i = 0 ; i < 31 ; i++){
              if ((n>>i)%2 ==0){ // set it
                 return  n | (1 << i );
              }
          }
         return 0;
    }
}
