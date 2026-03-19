package SortingAndSearchingAlgorithms.Searching.ExponentialSearch;

public class ExponentialSearch {

    static int binarySearch(int arr[], int left, int right, int target) {

        while(left <= right) {

            int mid = left + (right - left)/2;

            if(arr[mid] == target)
                return mid;

            if(arr[mid] < target)
                left = mid + 1;

            else
                right = mid - 1;
        }

        return -1;
    }

    static int exponentialSearch(int arr[], int n, int target) {

        if(arr[0] == target)
            return 0;

        int i = 1;

        while(i < n && arr[i] <= target)
            i = i * 2;

        return binarySearch(arr, i/2, Math.min(i, n-1), target);
    }

    public static void main(String[] args) {

        int arr[] = {3,6,9,12,15,18,21,24,27,30};

        int result = exponentialSearch(arr, arr.length, 21);

        if(result != -1)
            System.out.println("Element found at index " + result);
        else
            System.out.println("Element not found");
    }
}