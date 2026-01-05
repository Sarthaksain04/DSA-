package OOPs.ClassandObject.Question;

//9. Person Profile
//
//Complete Description:
//Create a class Person with name and age.
//Add a method to check whether the person is eligible to vote.
//
//Brief Description:
//Combines data + logic inside a class.



class Person{
    String name;
    int age;

    Person(String name , int age){
        this.name = name ;
        this.age = age;
    }
    void eligible(){
         if (age >=18){
             System.out.println(name+" is eligible to vote");
         }
    }
}

public class PersonProfile {
    public static void main(String[] args) {
        Person p1 = new Person("Sarthak Sain" , 18);
        p1.eligible();
        Person p2 = new Person("Shreya Singh" , 18);
        p2.eligible();

    }
}
