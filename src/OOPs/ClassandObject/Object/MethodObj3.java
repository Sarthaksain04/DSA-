package OOPs.ClassandObject.Object;

class BankAccount {
    String accountNumber;
    double balance;

    void setAccount(String accNo, double bal) {
        accountNumber = accNo;
        balance = bal;
    }

    void showAccount() {
        System.out.println("Account: " + accountNumber + " Balance: ₹" + balance);
    }
}


public class MethodObj3 {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.setAccount("Sarthak" , 1200000);
        b1.showAccount();
    }
}
