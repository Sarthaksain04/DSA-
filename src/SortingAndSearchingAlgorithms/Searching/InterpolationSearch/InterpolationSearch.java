package SortingAndSearchingAlgorithms.Searching.InterpolationSearch;

public class InterpolationSearch {
    static int interpolationSearch(int arr[], int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right && target >= arr[left] && target <= arr[right]) {

            int pos = left + ((target - arr[left]) * (right - left))
                    / (arr[right] - arr[left]);

            if (arr[pos] == target)
                return pos;

            if (arr[pos] < target)
                left = pos + 1;

            else
                right = pos - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70,80};

        int result = interpolationSearch(arr, 70);

        if(result != -1){
            System.out.println("Element found at index " + result);

        }
        else {
            System.out.println("Element not found");

        }
    }
}
