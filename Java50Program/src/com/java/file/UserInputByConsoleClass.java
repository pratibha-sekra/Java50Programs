package com.java.file;

import java.io.Console;

public class UserInputByConsoleClass {
	public static void main(String[] args) {
        Console console = System.console();
        if (console == null) {
            System.out.println("Unable to fetch console");
            return;
        }
        String line = console.readLine();
        console.printf("I saw this line: %s", line);
    }

}
