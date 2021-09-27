package ex24;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 John Slauter
 */

import java.util.Scanner;

public class App
{

    public static void main( String[] args )
    {

        Scanner sc = new Scanner(System.in);

        String input1, input2;

        System.out.print( "Enter two strings and I'll tell you if they are anagrams:\nEnter the first string: " );

        input1 = sc.nextLine();

        System.out.print("Enter the second string: ");

        input2 = sc.nextLine();

        System.out.print(isAnagram(input1, input2));

        sc.close();

    }

    protected static String isAnagram(String input1, String input2){

        if(input1.length() != input2.length()){

            return ("\"" + input1 + "\" and \"" + input2 + "\" are not anagrams.");

        }

        for(int i = 0; i < input1.length(); i++){

            if(!(input2.contains(input1.charAt(i)+""))){

                return ("\"" + input1 + "\" and \"" + input2 + "\" are not anagrams.");

            }

        }

        return ("\"" + input1 + "\" and \"" + input2 + "\" are anagrams.");

    }

}
