package Logger.java;


public class Logger {
 private static Logger instance;
 private Logger() {
     // Private constructor to prevent instantiation
 }

 // a global point of access to the instance
 public static Logger getInstance() {
     if (instance == null) {
         synchronized (Logger.class) {
             if (instance == null) {
                 instance = new Logger();
             }
         }
     }
     return instance;
 }

 // Method to log messages
 public void log(String message) {
     System.out.println("Log message: " + message);
 }
}

