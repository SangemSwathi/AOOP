package Logger.java;

public class Main {
	 public static void main(String[] args) {
	     // Step 4: Access the single instance of Logger
	     Logger logger = Logger.getInstance();

	     // Log some messages
	     logger.log("Application started.");
	     logger.log("Performing an operation...");
	     logger.log("Application finished.");
	 }
	}