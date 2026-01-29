package OOPs.ClassandObject.Question;

import java.util.ArrayList;

class Accounts{
   private    int accountNumber;
   private   int balance;
   private   ArrayList<Integer>transactions;


     Accounts(int accountNumber , int balance ){
           this.accountNumber = accountNumber;
           this.balance = balance;
           this.transactions = new ArrayList<>();
     }
     void deposite(int amount ){
          if (amount > 0){
              balance = amount + balance;
              transactions.add(amount);

          }
        }
     void Withdraw(int amount){
            if (amount > 0 && amount <= balance){
                 balance = balance - amount;
                 transactions.add( amount);
            }
            else {
                transactions.add( amount);
            }
     }
    public void showBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }
     void showTransactionHistory(){
         System.out.println("\nTransaction History:");
         for (int  transaction : transactions) {
             System.out.println(transaction);
         }

     }

}

public class BankingTransactionHistory {
    public static void main(String[] args) {
        Accounts acc  = new Accounts(1 , 300000);
        acc.showBalance();
        System.out.println();
        acc.deposite(300);
        acc.showBalance();

        acc.Withdraw(200);
        acc.showBalance();

        acc.showTransactionHistory();

    }

}
