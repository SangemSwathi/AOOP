package UserSession.java;
public class UserSession {
    private static UserSession instance;
    private boolean loggedIn;
    private String username;

    private UserSession() {
        loggedIn = false; // Initially, the user is not logged in
        username = null;
    }

    public static synchronized UserSession getInstance() {
        if (instance == null) {
            instance = new UserSession();
        }
        return instance;
    }

    // Method to log in the user
    public void login(String user) {
        this.loggedIn = true;
        this.username = user;
    }

    // Method to log out the user
    public void logout() {
        this.loggedIn = false;
        this.username = null;
    }

    // Method to check if the user is logged in
    public boolean isLoggedIn() {
        return loggedIn;
    }

    // Method to get the username of the logged-in user
    public String getUsername() {
        return username;
    }
}
