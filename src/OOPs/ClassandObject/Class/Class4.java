package OOPs.ClassandObject.Class;

class Account{
    double balance = 1000.19;

    void deposit(double amount){
        balance  = amount+ balance;
        System.out.println(amount);
    }
    void withdraw(double amount){
        if (amount <= balance){
            balance =  balance - amount;
            System.out.println(amount);
        }
        else {
            System.out.println("insufficient balance!");
        }
    }
    void showbalance(){
        System.out.println(balance);
    }
}


public class Class4 {
    public static void main(String[] args) {
        Account A1 = new Account();
        A1.deposit(500);
        A1.withdraw(300);
        A1.showbalance();

    }
}
