package OOPs.ClassandObject.Constructor.ParametrizedConstructor;

class Account {
    int accountNumber;
    double balance;

    Account(int acc, double bal) {
        accountNumber = acc;
        balance = bal;
    }

    void display() {
        System.out.println("Account No: " + accountNumber + ", Balance: ₹" + balance);
    }
}


public class ex4 {
    public static void main(String[] args) {
        Account a = new Account(12 , 1200000000);
        a.display();
    }
}
