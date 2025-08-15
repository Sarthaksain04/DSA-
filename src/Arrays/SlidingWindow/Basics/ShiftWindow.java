package Arrays.SlidingWindow.Basics;

public class ShiftWindow {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 8, 2, 9};
        int k = 3;
        for (int i = 0; i <= arr.length - k ; i++) {   // in this we initialize the loop in which it start from 0 and end at i <= arr.length - k (why this because it tells that  exactly  whats the end is
                                                      // for ex {2 , 3 , 4 , 5 , 6 , 7} here k = 3 so after putting thisi <= arr.length - k it tells the end exactly till how many times to itrate the window to shift that it dont go outside the arr
                                                     // ex i <= arr.length - k = 0 + 6 - 3  = 3 means the windows shift till the 3 rd index so it make sense when i reach to the last index it sures that ki jo elements bache woh window ki length tk
                                                    //bache mtlb ki arr ki length 6 hai aur window 3 ki to jb woh 3 index prr aye toh 3 index se last arr ki length tak window ki length tk he value bache )

            int end = i + k - 1; // this helps to give the end index of current windoe to print  the  window if i = 0 then 0 + 2 = 0 - 2   if i = 1 then 1 + 2  = 3 means 1 - 3 so it tells the end index of current window


            for (int j = i; j <= end; j++) {
                System.out.print(arr[j] + " ");


            }
            System.out.println();
        }
    }
}
