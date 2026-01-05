package CollectionFrameWork.List.LinkedLIst.Questions;

import java.util.LinkedList;

public class LLtoArray {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);

        int[] arr = new int[list.size()];
        System.out.print("[");
        for (int i = 0; i <arr.length ; i++) {
             arr[i] = list.get(i);
            System.out.print(arr[i] +"  ");
        }
        System.out.print("]");



    }
}
