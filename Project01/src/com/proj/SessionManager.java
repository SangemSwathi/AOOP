package com.proj;

import java.util.Timer;
import java.util.TimerTask;

public class SessionManager {

    private boolean isLoggedIn = false;
    private Timer timer;
    private static final long TIMEOUT_PERIOD = 5 * 60 * 1000; // 5 minutes in milliseconds

    // Method to start a session
    public void login() {
        isLoggedIn = true;
        startTimer();
        System.out.println("User logged in. Session started.");
    }

    // Method to logout (manual)
    public void logout() {
        if (isLoggedIn) {
            isLoggedIn = false;
            stopTimer();
            System.out.println("User logged out. Session ended.");
        }
    }

    // Check if the session is active
    public boolean isActive() {
        return isLoggedIn;
    }

    // Simulates user activity (resets timer)
    public void activity() {
        if (isLoggedIn) {
            resetTimer();
            System.out.println("User activity detected. Session timer reset.");
        }
    }

    // Starts or resets the timeout timer
    private void startTimer() {
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                timeout();
            }
        }, TIMEOUT_PERIOD);
    }

    private void resetTimer() {
        stopTimer();
        startTimer();
    }

    private void stopTimer() {
        if (timer != null) {
            timer.cancel();
            timer = null;
        }
    }

    private void timeout() {
        isLoggedIn = false;
        System.out.println("Session timed out due to inactivity.");
    }

    public static void main(String[] args) {
        SessionManager sessionManager = new SessionManager();
        sessionManager.login();

        // Simulate user activity
        sessionManager.activity();

        // Simulate inactivity longer than timeout period
        try {
            Thread.sleep(6 * 60 * 1000); // 6 minutes
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Test manual logout
        sessionManager.logout();
    }
}
