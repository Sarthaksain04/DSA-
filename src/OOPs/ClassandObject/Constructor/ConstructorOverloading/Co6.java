package OOPs.ClassandObject.Constructor.ConstructorOverloading;

import java.sql.SQLOutput;

class Account{
    String Name;
    int Balance;
      Account(){
           Balance = 1000;
          System.out.println("Balance " + Balance );
      }
      Account( int Balance){
          this.Balance = Balance ;
          System.out.println();
          System.out.println("Account Details 2");
          System.out.println("Balance " + Balance );

      }
      Account(String Name , int Balance){
          this.Name = Name ;
          this.Balance = Balance ;
          System.out.println();
          System.out.println("Account Details 3");
          System.out.println("Name :" + Name );
          System.out.println("Balance " + Balance );

      }
}

public class Co6 {
    public static void main(String[] args) {


        Account A1 = new Account();
        Account A2 = new Account(1200000);
        Account A3 = new Account("Sarthak ", 123456);
    }
}