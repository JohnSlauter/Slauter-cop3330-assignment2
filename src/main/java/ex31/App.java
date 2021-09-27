package ex31;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 John Slauter
 */

import java.util.Scanner;

public class App {

    protected static final int spacing_constant = 13;

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        int age, resting_pulse;

        System.out.print("Enter your age: ");

        age = get_input(s);

        System.out.print("Enter your resting heart rate: ");

        resting_pulse = get_input(s);

        s.close();

        print_chart(age, resting_pulse);

    }

    protected static void print_chart(int age, int resting_pulse){

        int spacing = 13;

        System.out.print(String.format("Resting Pulse: %d%sAge: %d\n", resting_pulse, print_spaces(8), age));

        System.out.print(String.format("\nIntensity%s| Rate", print_spaces(spacing_constant-9)));

        System.out.print(String.format("\n%s|%s", "-".repeat(spacing_constant), "-".repeat(spacing_constant-5)));

        for(int i = 55; i < 100; i += 5){

            System.out.print(get_line(i, age, resting_pulse));

        }


    }

    protected static String get_line(int i, int age, int resting_pulse){

        return String.format("\n%d%%%s| %d bpm", i, print_spaces(spacing_constant-3), calc_target_heart_rate(age, resting_pulse, i));

    }

    protected static int calc_target_heart_rate(int age, int resting_heart_rate, int intensity_percentage){

        double res = (220-age-resting_heart_rate)*intensity_percentage;

        res /= 100;

        res += resting_heart_rate;

        return round_double(res);

    }

    protected static int get_input(Scanner s){

        String temp = "";

        while(temp.equals("")){

            temp = s.nextLine();

            if(!verify_input(temp)){

                temp = "";

            }

        }

        return String_to_Int(temp);

    }

    protected static boolean verify_input(String s){

        for(int i = 0; i < s.length(); i++){

            if(s.charAt(i) < '0' || '9' < s.charAt(i)){

                return false;

            }

        }

        if(String_to_Int(s) < 1){

            return false;

        }

        return true;

    }

    protected static int String_to_Int(String s){

        int num = 0;

        for(int i = 0; i < s.length(); i++){

            if('0' <= s.charAt(i) && s.charAt(i) <= '9'){

                num += (s.charAt(i)-'0')*pow(10, s.length()-1-i);

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

    protected static String print_spaces(int num){

        if(num < 1){

            return "";

        }

        String space = " ".repeat(num);

        return space;

    }

    protected static int round_double(double num){

        int temp = (int)num;

        if(0.5 <= num - temp){

            return temp + 1;

        }

        return temp;

    }

}
