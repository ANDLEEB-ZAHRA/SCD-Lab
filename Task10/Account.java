package Task10;
public class Account {

    double balance;

    // Constructor
    public Account(double balance) {
        this.balance = balance;
    }

    // Withdraw Method
    public void withdraw(double amount) 
            throws InvalidAmountException, InsufficientFundsException {

        // check negative or zero amount
        if (amount <= 0) {
            throw new InvalidAmountException(
                    "You cannot withdraw a negative amount.");
        }

        // check insufficient balance
        if (amount > balance) {
            throw new InsufficientFundsException(
                    "Insufficient balance in your account.");
        }

        // perform withdrawal
        balance -= amount;
        System.out.println("Withdrawal successful!");
        System.out.println("Remaining Balance: " + balance);
    }
}