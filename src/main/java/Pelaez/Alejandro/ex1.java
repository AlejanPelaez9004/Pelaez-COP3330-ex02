/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alejandro Pelaez
 */
package Pelaez.Alejandro;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args)
    {
        System.out.print("What is your name?");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.print("Hello " + name + ", nice to meet you!");
        System.out.print("\n");
    }
}
