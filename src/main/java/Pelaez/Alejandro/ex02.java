/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alejandro Pelaez
 */
package Pelaez.Alejandro;
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args)
    {
        System.out.print("What is the input string? ");
        Scanner input = new Scanner(System.in);
        String string = input.next();
        System.out.println(string + " has " + string.length() + " characters.");
    }
}
