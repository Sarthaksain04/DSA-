package OOPs.ClassandObject.Question;


//19. Mobile Phone Battery
//
//Complete Description:
//Create a class MobilePhone with batteryLevel.
//Add methods to consume battery and recharge it.
//
//Brief Description:
//Focuses on object lifecycle and state change.

class MobilePhone{
    int batteryLevel ;

    MobilePhone( int b ){
        this.batteryLevel = b ;
    }

    void Consumed(){
        if (batteryLevel == 0 ){
            System.out.println("consume battery recharge it");
        }
    }
}

public class MobilePhoneBattery {
    public static void main(String[] args) {
        MobilePhone m1 = new MobilePhone(0);
        m1.Consumed();

    }
}
