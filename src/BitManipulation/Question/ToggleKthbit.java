package BitManipulation.Question;

public class ToggleKthbit {
    public static void main(String[] args) {
        int n = 508;
        int k = 3;
        System.out.println(Toggle(n , k )) ;
    }
    static int Toggle(int n , int k ){

        return (n ^(1 << k));
    }
}
