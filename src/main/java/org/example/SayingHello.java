/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 John Page
 */

package org.example;

import java.util.Scanner;

public class SayingHello
{
    public static void main(String[] args) {

        System.out.println("Please enter your name:"); //ask for users' name
        Scanner input = new Scanner(System.in); //brings in name
        String name = input.nextLine(); //records user response
        System.out.print("Greetings, "+name+ ", how are you!");
    }
}
