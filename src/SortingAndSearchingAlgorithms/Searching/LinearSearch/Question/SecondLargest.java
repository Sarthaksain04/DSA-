package SortingAndSearchingAlgorithms.Searching.LinearSearch.Question;



public class SecondLargest {
    public static int second(int[] arr){
        int largest = arr[0];
        int Second = -1;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] > largest){
                Second = largest;
                largest = arr[i];
            }


          // Update second only if the current element is bigger than the current second largest but not equal to the largest element.

            else if (arr[i] != largest && arr[i] > Second){
                Second = arr[i];
            }

        }
        return Second;
    }
    public static void main(String[] args) {
        int[] arr = {3 , 5 , 12 , 2 , 6 ,  2 , 34 , 23};
        int ans  = second(arr);
        System.out.println(ans);
    }
}
