package RecursionandBacktracking.Backtracking.SomeBasicQuestionOnMazesBeforeBacktracking;

public class CountingPaths {
    public static void main(String[] args) {
        System.out.println(count(3 , 3));
        System.out.println(count1(1 , 1));
    }
    static int count(int  r , int c){
        if (r==1 || c==1 ){
            return 1;
        }
        int left = count(r - 1 , c);
        int right = count(r, c -1);
        return left + right ;
    }


      // Another Way
    static int count1(int  r , int c){
        if (r==3 || c==3 ){
            return 1;
        }
        int left = count1(r + 1 , c);
        int right = count1(r, c +1);
        return left + right ;
    }
}
