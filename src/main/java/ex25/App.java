package ex25;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 John Slauter
 */

import java.util.Scanner;

public class App {

    private static final int length_threshold = 8;

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String password, strength_rating;

        int password_strength = 0;

        System.out.print("Enter a password: ");

        password = sc.nextLine();

        password_strength = passwordValidator(password);

        strength_rating = evaluate_password(password_strength);

        System.out.print(String.format("The password '%s' is a %s password.", password, strength_rating));

        sc.close();

    }

    protected static int passwordValidator(String password){

        int letter_counter = 0, number_counter = 0, special_counter = 0;

        for(int i = 0; i < password.length(); i++){

            if('A' <= password.toUpperCase().charAt(i) && password.toUpperCase().charAt(i) <= 'Z'){

                letter_counter++;

            }

            else if('0' <= password.charAt(i) && password.charAt(i) <= '9'){

                number_counter++;

            }

            else{

                special_counter++;

            }

        }

        if(length_threshold <= password.length() && number_counter > 0 && letter_counter > 0){

            if(special_counter > 0){

                return 3;

            }

            return 2;

        }

        else if(password.length() < length_threshold){

            if(number_counter == password.length()){

                return 0;

            }

            if(letter_counter == password.length()){

                return 1;

            }

        }

        return -1;

    }

    protected static String evaluate_password(int password_strength){

        switch(password_strength){

            case 1: {

                return "weak";

            }

            case 2: {

                return "strong";

            }

            case 3: {

                return "very strong";

            }

        }

        return "very weak";

    }


}
