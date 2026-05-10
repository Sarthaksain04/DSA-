package BitManipulation.Question;

public class FindXor {
    public static void main(String[] args) {
           int l = 4 ;
           int  r = 8 ;
        System.out.println( Find( l , r));
    }
    public static int xor(int   n){
        if(n %4 == 1 ) return 1 ;
        else if(n %4 == 2 ) return n + 1 ;
        else if(n %4 == 3 ) return 0 ;
        else return n ;
   }

   public static int Find(int l , int r ){
          return xor(l - 1 )^ xor(r);
   }
}
