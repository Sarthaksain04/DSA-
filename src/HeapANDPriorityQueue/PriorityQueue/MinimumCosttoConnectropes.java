package HeapANDPriorityQueue.PriorityQueue;


import java.util.PriorityQueue;


class Solution{

        public static int minCost(int[] arr) {


            // code here
            PriorityQueue<Integer> ans = new PriorityQueue<>();

            for (int i : arr) {
                ans.add(i);

            }
            int total = 0 ;
             while(ans.size() > 1) {

                 int sum = ans.poll() + ans.poll();

                 total+=sum;
                 ans.add(sum);


             }
            return total;
        }


}


public class MinimumCosttoConnectropes {
    public static void main(String[] args) {

        int[] arr = { 4 , 2 , 7 , 6 , 9};

        System.out.println(Solution.minCost(arr));

    }
}





//public int findMin(int[] nums) {
//    int n = nums.length - 1;
//    int last = nums[n];
//    int left = 0, right = n;
//
//    while (left < right) {
//        int mid = (left + right) >> 1;
//        if (nums[mid] > last) left = mid + 1;
//        else right = mid;
//    }
//
//    return nums[left];
//}
//}