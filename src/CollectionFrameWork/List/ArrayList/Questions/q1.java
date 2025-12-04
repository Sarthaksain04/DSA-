package CollectionFrameWork.List.ArrayList.Questions;

public class q1 {
    public static void main(String[] args) {
           int[] nums = {1,1,2,2,3,4,2,3};
           int k =  6;
           int x = 2 ;
           //Output: [6,10,12]

        for (int i = 0; i <= nums.length - k ; i++) {
            int end  = i  + k - 1 ;
            for (int j = i; j <= end; j++) {
                int count = 0 ;
                boolean Counted = false;
                for (int l = 0  ; l < j ; l++){
                    if (nums[j] == nums[l]){
                        Counted = true;
                        break;
                    }

                }
                if (Counted) continue;
                for (int l = 0; l <= end; l++) {
                    if (nums[j] == nums[l]) {
                        count++;
                    }
                    if (count == x){
                        System.out.println(nums[l]);
                    }
                }
            }
        }
    }
}
