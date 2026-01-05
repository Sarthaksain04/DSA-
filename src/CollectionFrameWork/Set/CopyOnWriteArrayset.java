package CollectionFrameWork.Set;

import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArrayset {
    public static void main(String[] args) {
           // Thread-Safe
           // Copy on Write Mechanism
         // No Duplicate Elements
         // Iterators do not Reflect Modifications

        CopyOnWriteArraySet<Integer> copyOnWriteSet = new CopyOnWriteArraySet<>();
        ConcurrentSkipListSet<Integer> concurrentSkipListSet = new ConcurrentSkipListSet<>();
        for (int  i = 0;  i <= 5  ;  i++) {
            copyOnWriteSet.add(i);
            concurrentSkipListSet.add(i);
        }
        System.out.println("Initial CopyOnWriteArraySet: " + copyOnWriteSet);
        System.out.println("Initial ConcurrentSkipListSet: " + concurrentSkipListSet);

        System.out.println("\n Ierating and Modifying CopyOnWriteArraySet");
        for (Integer num : copyOnWriteSet) {
            System.out.println( num);
            copyOnWriteSet.add(6);
        }
        System.out.println(copyOnWriteSet);

    }
}
