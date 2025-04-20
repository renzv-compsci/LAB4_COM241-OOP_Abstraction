/*Write a Java program to create an abstract class BankAccount with abstract
 * methods deposit() and withdraw(). Create subclasses: SavingsAccount and
 *  CurrentAccount that extends the BankAccount class and implement the 
 * respective methods to handle deposits and withdrawal for each account type*/

abstract class BankAccount {
    abstract void deposit();
    abstract void withdraw();
}

class SavingsAccount extends BankAccount {
    @Override
    public void deposit() {
        System.out.println("This method handles deposits in Savings Account");
    }

    @Override
    public void withdraw() {
        System.out.println("This method handles withdrawals in Savings Account");
    }
}

class CurrentAccount extends BankAccount {
    @Override
    public void deposit() {
        System.out.println("This method handles deposits in Current Account");
    }

    @Override 
    public void withdraw() {
        System.out.println("This method handles withdrawals in Current Account");
    }
}

public class TestBank {
    public static void main(String[] args) {
        
        BankAccount savings = new SavingsAccount();
        BankAccount current = new CurrentAccount();

        savings.withdraw();
        savings.deposit();

        current.deposit();
        current.withdraw();
    }
}