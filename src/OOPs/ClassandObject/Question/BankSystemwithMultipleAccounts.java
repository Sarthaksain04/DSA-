package OOPs.ClassandObject.Question;


import java.util.ArrayList;

class BankAcc{
      int accountNumber;
      String accountHolderName ;
      int balance;
      BankAcc(int accountNumber  , String accountHolderName , int balance){
             this.accountNumber = accountNumber;
             this.accountHolderName = accountHolderName;
             this.balance = balance;
      }
      void deposit(int amount){
           balance = amount + balance;
          System.out.println("balance :"+ balance);
      }
      void  withdraw(int amount){
          balance = balance - amount;
      }
      void getbalance(){
          System.out.println("Current blance :" + balance);
      }
    int getAccountNumber() {
        return accountNumber;
    }
      void displayAccountDetails(){
          System.out.println();
          System.out.println("Acc number : "+ accountNumber);
          System.out.println("Acc Holder Name : "+ accountHolderName);
          System.out.println("balance : " + balance);
      }
}

class  BankSystem{
    ArrayList<BankAcc> acc ;

    BankSystem(){
          acc = new ArrayList<>();
    }
    void addAcc(BankAcc account){
            acc.add(account);
    }

   void depositToAccount(int accountNumber, int amount){


     for (BankAcc accounts : acc){
         if(accounts.getAccountNumber() == accountNumber){
             accounts.deposit(amount);
             return;
         }
     }
   }
    void withdrawFromAccount(int accountNumber, int amount){
        for (BankAcc accounts : acc){
            if(accounts.getAccountNumber() == accountNumber){
                accounts.withdraw(amount);
                return;
            }
        }
    }
    void displayAllAccounts(){
        for (BankAcc A : acc){
            A.displayAccountDetails();
        }
    }


}

public class BankSystemwithMultipleAccounts {
    public static void main(String[] args) {
        BankAcc b1 = new BankAcc(1 , "Sarthak Sain", 500000);
        BankAcc b2 = new BankAcc(2 , "Peter Parker ", 4500000);
        BankAcc b3 = new BankAcc(3 , "Thor", 534444000);
        BankAcc b4 = new BankAcc(4 , "Tony", 90000000);
        b1.displayAccountDetails();



        BankSystem sbi = new BankSystem();
        sbi.addAcc(b1); // add new bank account
        sbi.addAcc(b2); // add new bank account
        sbi.addAcc(b3); // add new bank account
        sbi.addAcc(b4); // add new bank account
        System.out.println();
        System.out.println("All Bank  Details:");

        sbi.displayAllAccounts(); // shows final balances of all accounts

        sbi.depositToAccount(1 ,500);  // deposite money at bank number
        b1.displayAccountDetails();

        sbi.withdrawFromAccount(1 , 500); // withdraw
        b1.displayAccountDetails();

    }
}
