package ex26;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 John Slauter
 */

import java.util.Scanner;

public class App {

    public static void main(String[] args){

        double balance, APR, monthly_payment;

        int num_months;

        PaymentCalculator Calculator = new PaymentCalculator();

        Scanner sc = new Scanner(System.in);

        System.out.print("What is your balance? ");

        balance = sc.nextDouble();

        System.out.print("What is the APR on the card (as a percent)? ");

        APR = sc.nextDouble();

        System.out.print("What is the monthly payment you can make? ");

        monthly_payment = sc.nextDouble();

        num_months = Calculator.calculateMonthsUntilPaidOff(balance, APR, monthly_payment);

        System.out.print("It will take you " + num_months + " months to pay off this card.");

    }

}
