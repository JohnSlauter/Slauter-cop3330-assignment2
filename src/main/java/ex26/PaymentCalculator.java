package ex26;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 John Slauter
 */

import java.math.*;

public class PaymentCalculator {

    public PaymentCalculator(){}

    public static int calculateMonthsUntilPaidOff(double balance, double APR, double monthly_payment){

        int num_months;

        double daily_rate = percentage_to_decimal(APR)/365;

        balance = round_cents(balance);

        monthly_payment = round_cents(monthly_payment);

        num_months = ceiling(-1.0/30 * Math.log(1+balance/monthly_payment*(1-Math.pow(1+daily_rate,30))) / Math.log(1+daily_rate));

        return num_months;

    }

    protected static double round_cents(double num){

        int temp = (int)(num*100);

        if(0.5 <= num*100 - temp){

            return ((double)(temp+1))/100;

        }

        return ((double)temp)/100;

    }

    protected static int ceiling(double num) {

        int temp = (int)num;

        if (temp < num) {

            return temp + 1;

        }

        return temp;

    }

    protected static double percentage_to_decimal(double percentage){

        return percentage/100;

    }

}
