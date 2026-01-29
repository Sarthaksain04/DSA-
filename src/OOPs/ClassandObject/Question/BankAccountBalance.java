package OOPs.ClassandObject.Question;
//8. Bank Account Balance
//
//Complete Description:
//Create a class BankAccount with accountNumber and balance.
//Add methods deposit() and displayBalance().
//
//Brief Description:
//Shows how objects maintain and update internal state.


class BankAccount{
      String accountNumber;
      double  balance;

      BankAccount(String accountNumber , double  balance){
          this.accountNumber = accountNumber;
          this.balance = balance;
      }
      void deposit(double amount){
          balance = balance + amount;

      }
      void displayBalance(){
          System.out.println("Account Number: " + accountNumber);
          System.out.println("Current Balance: " + balance);
          System.out.println("_______________________");
      }


}

public class BankAccountBalance {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("123" , 50000);
        acc1.displayBalance();
        acc1.deposit(2000);
        acc1.displayBalance();
        BankAccount acc2 = new BankAccount("124" , 50000);
        acc2.displayBalance();
        acc2.deposit(3000);
        acc2.displayBalance();


    }
}
