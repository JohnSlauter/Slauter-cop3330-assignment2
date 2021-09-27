package ex38;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 John Slauter
 */

import java.util.Scanner;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        String input;

        ArrayList<Integer> evens;

        int[] int_array;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter a list of numbers, separated by spaces: ");

        input = s.nextLine();

        int_array = convert_input(input);

        evens = filterEvenNumbers(int_array);

        print_evens_list(evens);

        s.close();

    }

    protected static ArrayList<Integer> filterEvenNumbers(int[] list){

        ArrayList<Integer> evens = new ArrayList<Integer>();

        for(int i : list){

            if(i % 2 == 0){

                evens.add(i);

            }

        }

        return evens;

    }

    protected static int[] convert_input(String s){

        String[] str_array = s.split(" ");

        int[] int_array = new int[str_array.length];

        for(int i = 0; i < str_array.length; i++){

            int_array[i] = String_to_int(str_array[i]);

        }

        return int_array;

    }

    private static void print_evens_list(ArrayList<Integer> list){

        System.out.print("The even numbers are");

        for(int i : list){

            System.out.print(String.format(" %d", i));

        }

        System.out.print(".");

    }

    private static int String_to_int(String s){

        boolean negative = false;

        int ans = 0, start = 0;

        if(s.charAt(0) == '-'){

            negative = true;

            start++;

        }

        for(int i = start; i < s.length(); i++){

            ans += (s.charAt(i) - '0')*pow(10, s.length()-1-i);

        }

        if(negative){

            ans *= -1;

        }

        return ans;

    }

    private static int pow(int base, int exponent){

        int ans = 1;

        for(int i = 0; i < exponent; i++){

            ans *= base;

        }

        return ans;

    }

}
