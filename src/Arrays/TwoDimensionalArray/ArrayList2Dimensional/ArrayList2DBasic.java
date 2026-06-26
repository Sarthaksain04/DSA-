package Arrays.TwoDimensionalArray.ArrayList2Dimensional;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayList2DBasic {
    public static void main(String[] args) {
        ArrayList<Integer> a =  new ArrayList<>();
        a.add(3); a.add(13); a.add(36) ; a.add(132);
        ArrayList<Integer> b =  new ArrayList<>();
        b.add(1); b.add(2); b.add(3);
        ArrayList<Integer> c =  new ArrayList<>();
        c.add(2); c.add(3); c.add(5) ; c.add(7); c.add(11);

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(a); arr.add(b) ; arr.add(c);

        System.out.println(arr);

        System.out.println();


        // print with for loop
        for (int i = 0; i < arr.size() ; i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {

                System.out.print(arr.get(i).get(j)+" ");
            }
            System.out.println();
        }

        // also can print through for each loop

        System.out.println();
        for (ArrayList<Integer> list : arr){
            for (int ele : list){
                System.out.print(ele+" ");
            }
            System.out.println();
        }

    }
}
