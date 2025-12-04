package CollectionFrameWork.List.Comparator;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2){ // Through comparator
        return o1 - o2 ; // increasing order
    }
}


class MyComparator2 implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2){
        return o2 - o1 ; // Decreasing order
    }
}

public class Customsorting {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);

        list.sort(new MyComparator());
        System.out.println(list);

        list.sort(new MyComparator2());
        System.out.println(list);
    }
}
