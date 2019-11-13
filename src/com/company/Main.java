package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.println("please enter you age");
        int age = user_input.nextInt();
        System.out.println("Your age is  "+ age);

        if (age < 23)
        {
            System.out.println("you are young");
        }
        System.out.println("You are old as coconut");

	// write your code here
    }
}
