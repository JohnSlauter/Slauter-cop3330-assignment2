package ex32;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 John Slauter
 */

import java.util.Scanner;

public class guessing_game {

    private static int num;

    private static Scanner s;

    public guessing_game(){

        s = new Scanner(System.in);

    }

    public static void setup(){

        String temp = "";

        while(temp.equals("")){

            System.out.print("Enter the difficulty level (1, 2, or 3): ");

            temp = s.nextLine();

            if(!is_int(temp)){

                temp = "";

            }

        }

        num = generate_number(String_to_int(temp));

        game();

    }

    private static void game(){

        String temp;

        int curr_guess = 0, guess_counter = 0;

        System.out.print("I have my number. What's your guess? ");

        while (curr_guess != num){

            if(0 < guess_counter){

                System.out.print("Guess again: ");

            }

            guess_counter++;

            temp = s.nextLine();

            if(!is_int(temp)){

                System.out.print("Enter a number. ");

                continue;

            }

            curr_guess = String_to_int(temp);

            if(curr_guess < num){

                System.out.print("Too low. ");

            }

            else if(num < curr_guess){

                System.out.print("Too high. ");

            }

        }

        System.out.print(String.format("You got it in %d guesses!\n", guess_counter));

        end();

    }

    private static void end(){

        String temp = "";

        while(!temp.equals("y") && !temp.equals("n")){

            System.out.print("\nDo you wish to play again (Y/N)?");

            temp = s.nextLine().toLowerCase();

        }

        if(temp.equals("y")){

            setup();

        }

        else{

            s.close();

        }

    }

    private static int generate_number(int difficulty){

        return 1 + (int)(Math.random()*(pow(10, difficulty) + 1));

    }

    protected static int pow(int base, int exponent) {

        int res = 1;

        for(int i = 0; i < exponent; i++){

            res *= base;

        }

        return res;

    }

    protected static boolean is_int(String s){

        for(int i = 0; i < s.length(); i++){

            if(s.charAt(i) < '0' || '9' < s.charAt(i)){

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

}
