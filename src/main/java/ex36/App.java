package ex36;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 John Slauter
 */

import java.util.Scanner;

import java.util.ArrayList;

public class App {

    public static void main(String[] args){

        calculator calc = new calculator();

        ArrayList<Integer> list = get_input();

        print_int_list(list);

        System.out.print(String.format("\nThe average is %f\nThe minimum is %d\nThe maximum is %d\nThe standard deviation is %f", calc.average(list), calc.min(list), calc.max(list), calc.std(list)));

    }

    private static ArrayList<Integer> get_input(){

        ArrayList<Integer> list = new ArrayList<Integer>();

        Scanner s = new Scanner(System.in);

        String temp;

        do{

            System.out.print("Enter a number: ");

            temp = s.nextLine();

            if(is_int(temp)){

                list.add(String_to_int(temp));

            }

        }while(!temp.equals("done"));

        s.close();

        return list;

    }

    private static boolean is_int(String s){

        for(int i = 0; i < s.length(); i++){

            if(s.charAt(i) < '0' || '9' < s.charAt(i)){

                return false;

            }

        }

        return true;

    }

    private static int String_to_int(String in){

        int num = 0;

        for(int i = 0; i < in.length(); i++){

            num += (in.charAt(i)-'0')*pow(10, in.length()-1-i);

        }

        return num;

    }

    private static int pow(int base, int exponent) {

        int res = 1;

        for(int i = 0; i < exponent; i++){

            res *= base;

        }

        return res;

    }

    private static void print_int_list(ArrayList<Integer> list){

        System.out.print("Numbers:");

        for(int i = 0; i < list.size(); i++){

            System.out.print(String.format(" %d", list.get(i)));

            if(i < list.size()-1){

                System.out.print(",");

            }

        }

    }

}
