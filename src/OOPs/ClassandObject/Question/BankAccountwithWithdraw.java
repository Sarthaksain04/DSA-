package OOPs.ClassandObject.Question;

//12. Bank Account with Withdraw
//
//Complete Description:
//Create a BankAccount class with methods deposit() and withdraw().
//Prevent withdrawal if balance is insufficient.
//
//Brief Description:
//Introduces conditional logic inside class methods.

class BankAccount1{
    String AccName;
    double balance;

    BankAccount1(String AccName , double balance){
        this.AccName = AccName;
        this.balance = balance;

    }
    void deposit(double amount){
         balance = amount + balance ;
    }
    void Withdraw(double withdraw){
        if (balance - withdraw >= 500) {
            balance = balance - withdraw;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        }


        else{
            System.out.println("Withdrawal denied! Minimum balance of 500 must be maintained.");
        }



    }

    void displayBalance(){
        System.out.println("Account Number: " + AccName);
        System.out.println("Current Balance: " + balance);
        System.out.println("_______________________");
    }
}

public class BankAccountwithWithdraw {
    public static void main(String[] args) {
        BankAccount1 b1 = new BankAccount1("Sarthak" , 5000);
        b1.displayBalance();
        b1.deposit(400);
        b1.displayBalance();
        b1.Withdraw(500);
        b1.displayBalance();

    }
}
