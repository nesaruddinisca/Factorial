package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = i * fact;
        }
        System.out.println(" factorial of " + number + " is : " + fact);

    }
}
