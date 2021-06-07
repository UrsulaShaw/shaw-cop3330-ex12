/*
 * UCF COP3330 Summer 2021 Assignment 1 Solution
 * Copyright 2021 Ursula Shaw
 */

package base;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the principal: ");
        double principal = Double.parseDouble(in.nextLine());
        System.out.println("Enter the rate of interest: ");
        double rate = Double.parseDouble(in.nextLine());
        System.out.println("Enter the number of years: ");
        double years = Double.parseDouble(in.nextLine());

        double accrued = principal*(1 + ((rate/100.0)*years));

        System.out.printf("After %.0f years at %f percent, the investment wil be worth $%.2f.", years, rate, accrued);
    }
}
