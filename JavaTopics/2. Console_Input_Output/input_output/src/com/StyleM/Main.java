package com.StyleM;

import java.io.*;
import java.nio.charset.StandardCharsets;

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

        System.out.println("-------------------------------- Input methods----------------------------------");
        // Using buffered reader to get console input
        BufferedReader bufferedInput
                = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Type your name");
            String name = bufferedInput.readLine();
            System.out.println("Hello " + name);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // Using FileInputStream to get input from a file
        try {
            String fileName = "test.txt";
            FileInputStream fileInput = new FileInputStream("src/com/StyleM/" + fileName);

            System.out.println(fileName + " contains the following data:");

            // Reads the first byte
            int i = fileInput.read();

            while(i != -1) {
                System.out.print((char)i);

                // Reads next byte from the file
                i = fileInput.read();
            }
            fileInput.close();
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Note that the FileInputStream in this case assumes the current directory" +
                    " to be the example folder");
        }

        System.out.println("\n-----------------------Login simulation using console class----------------------");
        ConsoleLoginExample consoleLogin = new ConsoleLoginExample();
        consoleLogin.readUsername();
        consoleLogin.readPassword();
        consoleLogin.login();
    }
}
