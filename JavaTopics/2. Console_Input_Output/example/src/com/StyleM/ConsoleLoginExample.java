package com.StyleM;

import java.io.Console;
import java.util.Arrays;

/**
 * Demonstrates how to use the console class to
 * read a password securely
 */
public class ConsoleLoginExample {

    private Console console;
    private String username;
    private char[] password;
    private String correctUsername;
    private char[] correctPassword;

    public ConsoleLoginExample() {
        console = System.console();

        // Check if console is supported in the current runtime
        if (console == null) {
            System.out.println("Console is not supported");
            System.exit(1);
        }

        // Here we store a predefined correct password and a username
        // Note that in a real scenario the password would
        // be encrypted and probably read from a database
        correctUsername = "Jack";
        correctPassword = new char[]{'t', 'e', 's', 't', '1', '-', '2'};
    }

    /**
     * Asks the user to type their username and stores it
     */
    public void readUsername() {
        username = console.readLine("Type your username: ");
    }

    /**
     * Asks the user to type their password and stores it
     */
    public void readPassword() {
        password = console.readPassword("Type your password: ");
    }

    /**
     * Checks if the username and password match those in the system
     */
    public void login() {
        if (username.equals(correctUsername) && Arrays.equals(password, correctPassword)) {
            console.printf("Thanks %s! You are logged in.\n", username);
        }
        else {
            console.printf( "Sorry, the combination of username and password you provided " +
                            "doesn't match one in our system.\n");
        }

        // Clean up the password related fields for security reasons
        Arrays.fill(password, ' ');
        Arrays.fill(correctPassword, ' ');
    }
}
