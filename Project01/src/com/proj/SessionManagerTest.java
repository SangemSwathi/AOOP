package com.proj;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SessionManagerTest {

    private SessionManager sessionManager;

    @BeforeEach
    public void setup() {
        sessionManager = new SessionManager();
    }

    // Test 1: User login starts a session
    @Test
    public void testLogin() {
        sessionManager.login();
        assertTrue(sessionManager.isActive(), "Session should be active after login");
    }

    // Test 2: Manual logout ends the session
    @Test
    public void testManualLogout() {
        sessionManager.login();
        sessionManager.logout();
        assertFalse(sessionManager.isActive(), "Session should be inactive after manual logout");
    }

    // Test 3: Automatic timeout after inactivity
    @Test
    public void testAutomaticTimeout() throws InterruptedException {
        sessionManager.login();
        Thread.sleep(6 * 60 * 1000); // 6 minutes to trigger timeout
        assertFalse(sessionManager.isActive(), "Session should be inactive after automatic timeout");
    }

    // Test 4: User activity resets timeout
    @Test
    public void testActivityResetsTimeout() throws InterruptedException {
        sessionManager.login();
        Thread.sleep(2 * 60 * 1000); // 2 minutes of activity
        sessionManager.activity(); // Reset timeout due to activity
        Thread.sleep(4 * 60 * 1000); // Wait less than timeout
        assertTrue(sessionManager.isActive(), "Session should still be active due to activity reset");
    }

    // Test 5: Manual logout after some activity
    @Test
    public void testManualLogoutAfterActivity() {
        sessionManager.login();
        sessionManager.activity();
        sessionManager.logout();
        assertFalse(sessionManager.isActive(), "Session should be inactive after manual logout even after activity");
    }
}

