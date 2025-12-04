package CollectionFrameWork.List.Comparator;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Students{
     private String name;
     private double gpa ;

     public Students(String name , double gpa){
          this.name  = name;
          this.gpa = gpa;
     }

     public String getName(){
         return name;
     }

    public double getGpa() {
        return gpa;
    }
}

public class Student {
    public static void main(String[] args) {
        List<Students> s1 = new ArrayList<>();
        s1.add(new Students( "Charlie" , 3.5));
        s1.add(new Students("Bob" , 3.7));
        s1.add(new Students("Alice" ,  3.5));
        s1.add(new Students("Sarthak" , 3.9));

        Comparator<Students> c1 = Comparator.comparing(Students ::getGpa); // Method 1
        Comparator<Students> c2 = Comparator.comparing(Students ::getGpa).reversed();
//        // :: double collen operator  --> method reference it tells that what method you have to called
        Comparator<Students> c3 = Comparator.comparing(Students ::getGpa).reversed().thenComparing(Students::getName);
        // then comparing means it help to compare If two elements are equal based on the first comparison,
        //then it uses the second comparator to decide their order.

        s1.sort(c1);
        s1.sort(c2);
        s1.sort(c3);

//        s1.sort((o1 , o2) -> {
//            if (o2.getGpa() - o2.getGpa() > 0){ // method 2 lambda expression
//                return 1 ;
//            } else if (o2.getGpa() - o1.getGpa() < 0) {
//                 return -1;
//            }else{
//                return 0;
                 // return o1.getName().compareTo(o2.getName());
//            }
//        });

        for (Students s : s1) {
            System.out.println(s.getName() + ": " + s.getGpa());

        }

    }
}
