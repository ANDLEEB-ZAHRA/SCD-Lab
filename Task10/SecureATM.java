package Task10;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SecureATM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Initial balance (example)
        Account userAccount = new Account(1000);

        try {
            System.out.print("Enter amount to withdraw: ");
            double amount = sc.nextDouble();

            // call withdraw method
            userAccount.withdraw(amount);

        }
        // if user types letters instead of number
        catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid numerical value.");
        }
        // custom exception 1
        catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        }
        // custom exception 2
        catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
        // finally block (always runs)
        finally {
            System.out.println("Transaction Session Ended.");
            sc.close();
        }
    }
}