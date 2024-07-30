package com.example.logger;

public class SingletonTest {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Both should refer to the same instance
        if (logger1 == logger2) {
            System.out.println("Both logger instances are the same.");
        } else {
            System.out.println("Different instances of logger exist.");
        }

        // Test logging functionality
        logger1.log("This is a test log message.");
    }
}
