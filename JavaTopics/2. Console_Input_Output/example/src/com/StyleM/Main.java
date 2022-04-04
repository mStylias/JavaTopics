package com.StyleM;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        // Output using System.out
        System.out.println("-----------------------------Output using System.out-----------------------------");

        // print
        System.out.print("Hello world");
        System.out.print(" same line");

        // println
        System.out.println();
        System.out.println("Hello world");
        System.out.println("different line");

        // printf
        int x = 100;
        System.out.printf(
                "Printing simple"
                        + " integer: x = %d\n",
                x);

        // This will print up to
        // 2 decimal places
        System.out.printf(
                "Formatted with"
                + " 2 decimal places precision: PI = %.2f\n",
                Math.PI);

        float n = 5.2f;
        // Automatically appends zero
        // to the rightmost part of decimal
        System.out.printf(
                "Formatted to "
                + "specific width: n = %.4f\n",
                n);

        n = 2324435.3f;
        // Here the number is formatted from
        // right margin and occupies a
        // width of 20 characters
        System.out.printf(
                "Formatted to "
                        + "right margin: n = %20.4f\n",
                n);

        System.out.println("-----------------------Login simulation using console class----------------------");
        ConsoleLoginExample consoleLogin = new ConsoleLoginExample();
        consoleLogin.readUsername();
        consoleLogin.readPassword();
        consoleLogin.login();
    }
}
