package UserSession.java;

public class BankingOperation {
    private UserSession userSession;

    public BankingOperation() {
        userSession = UserSession.getInstance();
    }

    public void viewBalance() {
        if (userSession.isLoggedIn()) {
            // Retrieve and display balance logic here
            System.out.println("Viewing balance for user: " + userSession.getUsername());
        } else {
            System.out.println("Please log in to view balance.");
        }
    }

    public void deposit(double amount) {
        if (userSession.isLoggedIn()) {
            // Deposit logic here
            System.out.println("Depositing " + amount + " to account of user: " + userSession.getUsername());
        } else {
            System.out.println("Please log in to make a deposit.");
        }
    }

    public void withdraw(double amount) {
        if (userSession.isLoggedIn()) {
            // Withdraw logic here
            System.out.println("Withdrawing " + amount + " from account of user: " + userSession.getUsername());
        } else {
            System.out.println("Please log in to make a withdrawal.");
        }
    }
}

