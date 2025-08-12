package Arrays.PrefixSum;

public class RangeSumQuery {
    public static void main(String[] args) {
        int[] arr = {2 , 9 , 3 , 0 , 8 , 3 , 3 , 2 , 9 , 1};
        int l = 0 ;
        int r = 4 ;
        int ans = 0 ;
        for (int i = l; i <= r; i++)  ans = arr[i] + ans ;
            System.out.println(ans);

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
        System.out.println();
        if (l == 0) {
            System.out.println(sum[r]);
        }
        else {
            System.out.println(sum[r] - sum[l - 1]);
        }
    }
}
