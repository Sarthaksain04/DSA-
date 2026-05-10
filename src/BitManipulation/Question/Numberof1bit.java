package BitManipulation.Question;

public class Numberof1bit {
    public static void main(String[] args) {
        int n = 8 ;
        System.out.println(setBIt(n));
    }
    static int setBIt(int n ){
          int count = 0 ;
        for (int i = 0; i <31 ; i++) {
            if ((n >>i) % 2 !=0 ) count++;
        }
        return count;
    }
}
