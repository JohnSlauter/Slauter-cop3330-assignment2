package ex28;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 John Slauter
 */

import java.util.Scanner;

public class App {

    private static final int num_inputs = 5;

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String stor;

        int[] list = new int[num_inputs];

        for(int i = 0; i < num_inputs; i++){

            System.out.print("Enter a number: ");

            stor = sc.nextLine();

            list[i] = String_to_int(stor);

        }

        int sum = summation(list);

        System.out.print("The total is " + sum + ".");

        sc.close();

    }

    protected static int summation(int[] list){

        int sum = 0;

        for(int i : list){

            sum += i;

        }

        return sum;

    }

    protected static int String_to_int(String in){

        boolean negative = false;

        int start = 0, num = 0;

        if(in.charAt(0) == '-'){

            negative = true;

            start++;

        }

        for(int i = start; i < in.length(); i++){

            if('0' <= in.charAt(i) && in.charAt(i) <= '9'){

                num += (in.charAt(i)-'0')*pow(10, in.length()-1-i);

            }

            else{

                return 0;

            }

        }

        if(negative){

            num *= -1;

        }

        return num;

    }

    protected static int pow(int base, int exponent){

        int ans = 1;

        for(int i = 0; i < exponent; i++){

            ans *= base;

        }

        return ans;

    }

}
