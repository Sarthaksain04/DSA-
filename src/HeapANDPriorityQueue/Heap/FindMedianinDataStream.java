package HeapANDPriorityQueue.Heap;


import java.util.*;

class MedianFinder{ // proper way to do it

      PriorityQueue<Integer> minHeap = new PriorityQueue<>();
      PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());


       MedianFinder(){
      }


      // 1  2   3   4   5
      public  void addNum(int num ){

          if (maxHeap.size() == 0 ) maxHeap.add(num);
          else{
              if (num < maxHeap.peek()) maxHeap.add(num);
              else minHeap.add(num);

          }

          if (maxHeap.size() == minHeap.size()+2)
              minHeap.add(maxHeap.remove());
          if  (minHeap.size() == maxHeap.size()+2)
              maxHeap.add(minHeap.remove());
        }


      public double findMedian(){
                if (maxHeap.size() == minHeap.size()+ 1)
                    return maxHeap.peek();

                else if (minHeap.size() == maxHeap.size()+1)
                     return minHeap.peek();

                 else
                     return (maxHeap.peek() + minHeap.peek()) / 2.0;
                }
}





public class FindMedianinDataStream {
    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 6, 5, 7, 12};

        MedianFinder mf = new MedianFinder();

        for (int num : arr) {

            mf.addNum(num);

            System.out.println(
                    "After adding " + num +
                            " Median = " + mf.findMedian()
            );


        }
    }

}

