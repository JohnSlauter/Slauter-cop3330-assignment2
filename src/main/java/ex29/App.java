package ex29;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 John Slauter
 */

import java.util.Scanner;

public class App {

    public static void main(String[] args){

        System.out.print(String.format("It will take %d years to double your initial investment", get_input()));

    }

    protected static int doubling_time(int rate_of_return){

        return ceiling((72.0/rate_of_return));

    }

    protected static int get_input(){

        int res;

        Scanner sc = new Scanner(System.in);

        String stor = "";

        while(stor.isEmpty()){

            System.out.print("What is the rate of return? ");

            stor = sc.nextLine();

            if(!is_valid_number(stor)){

                System.out.print("Sorry. That's not a valid input.\n");

                stor = "";

            }

        }

        res = String_to_int(stor);

        res = doubling_time(res);

        sc.close();

        return res;

    }

    protected static boolean is_valid_number(String in){

        if(in.equals("0") || in.isEmpty()){

            return false;

        }

        for(int i = 0; i < in.length(); i++){

            if(in.charAt(i) < '0' || '9' < in.charAt(i)){

                return false;

            }

        }

        return true;

    }

    protected static int String_to_int(String in){

        int num = 0;

        for(int i = 0; i < in.length(); i++){

            if('0' <= in.charAt(i) && in.charAt(i) <= '9'){

                num += (in.charAt(i)-'0')*pow(10, in.length()-1-i);

            }

            else{

                return 0;

            }

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

    protected static int ceiling(double num){

        int temp = (int)(num);

        if(0 < num - temp){

            return temp + 1;

        }

        return temp;

    }

}
