package SortingAndSearchingAlgorithms.Searching.LinearSearch.Question;

public class FirstNegative {

    public static int negativenumber(int []arr ){

        // if want to return first negative number

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] < 0) {
                return arr[i];
            }
        }
        return -1;
    }

    public static int negativenumber1(int []arr ){

        // if want to return last negative number
        int lastNegative = -1;

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] < 0) {
                lastNegative =  arr[i];
            }
        }
        return lastNegative;
    }


    public static void main(String[] args) {

        int[]arr = {5 , 4 , -3 , 2 ,-1 , 9 , -8 };
        int ans = negativenumber(arr);
        System.out.println(ans);

        int ans1 = negativenumber1(arr);
        System.out.println(ans1);
    }
}
