package CollectionFrameWork.Map.HashMap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(this.id , o.id);
    }
}

public class ComparableInterface {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(3, "Amit"));
        list.add(new Student(1, "Sarthak"));
        list.add(new Student(2, "Riya"));
        list.sort(null);
        System.out.println(list);
    }
}
