package SortingAndSearchingAlgorithms.Sorting.BucketSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class BucketSort {
    static void bucketSort(float[]arr){

        int n = arr.length;
        //Buckets
        ArrayList<Float>[] buckets = new ArrayList[n];

        // Create empty buckets

        for (int i = 0; i <n ; i++) {
            buckets[i] = new ArrayList<Float>();

        }

        // Add elements into our buckets

        for (int i = 0; i < n ; i++) {
            int bucketindex = (int)  arr[i] * n  ;
            buckets[bucketindex].add(arr[i]);
        }
        //Sort Each Bucket individually
        for (int i  = 0 ;  i < buckets.length ; i++){
            Collections.sort(buckets[i]);

        }

        // Merge all buckets to get Final sorted Array

        int index = 0 ;
        for (int i = 0; i < buckets.length ; i++) {
            ArrayList<Float> currentBucket = buckets[i];
            for (int j = 0; j < currentBucket.size() ; j++) {
                    arr[index++] = currentBucket.get(j);
            }
        }

    }
    public static void main(String[] args) {
        float[] arr = {0.5f , 0.4f , 0.3f , 0.2f , 0.1f };
         bucketSort(arr);
         for (float val : arr){
             System.out.print(val +  "  ");
         }
    }
}
