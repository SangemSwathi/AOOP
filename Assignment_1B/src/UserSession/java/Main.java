package UserSession.java;

public class Main {
    public static void main(String[] args) {
        UserSession session = UserSession.getInstance();

        // Logging in the user
        session.login("JohnDoe");

        BankingOperation operation = new BankingOperation();
        
        operation.viewBalance();
        operation.deposit(500);
        operation.withdraw(200);

        // Logging out the user
        session.logout();

        operation.viewBalance(); // Should prompt to log in
    }
}
