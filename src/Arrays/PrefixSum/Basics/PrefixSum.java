package Arrays.PrefixSum.Basics;

public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {2 , 9 , 3 , 0 , 8 , 3 , 3 , 2 , 9 , 1};
        for (int i = 0; i < arr.length ; i++) System.out.print(arr[i]+" ") ;
            int[] sum = new int[arr.length];
            sum[0] = arr[0];
            for (int i = 1; i < arr.length ; i++) {
                sum[i] = sum[i-1] + arr[i];
            }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(sum[i]+" ");
        }
    }
}
