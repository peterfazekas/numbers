package hu.numbers.service;

import java.util.Scanner;

/**
 * @author Peter_Fazekas on 2017.03.12..
 */
public class Console {

    private final Scanner scanner;

    public Console() {
        scanner = new Scanner(System.in);
    }

    public String readLine() {
        return scanner.nextLine();
    }

    public int readInt() {
        return scanner.nextInt();
    }
}
