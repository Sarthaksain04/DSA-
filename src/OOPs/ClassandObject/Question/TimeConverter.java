package OOPs.ClassandObject.Question;

//17. Time Converter
//
//Complete Description:
//Create a class Time with hours and minutes.
//Add a method to convert time into total minutes.
//
//Brief Description:
//Tests transformation logic using class data.

class Time{
    int Hour;
    int minutes;

    Time(int H , int m){
        this.Hour =H;
        this.minutes = m;


    }
    void convert(){
        int totalminutes =(Hour * 60) + minutes ;
        System.out.println("Total Minutes : " + totalminutes);
    }
}


public class TimeConverter {
    public static void main(String[] args) {
        Time T1 = new Time(2 , 37);
        T1.convert();

    }
}
