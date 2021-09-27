package ex33;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 John Slauter
 */

public class magical_eight_ball {

    private static int num_responses = 4;

    private static String[] responses = {"Yes", "No", "Maybe", "Ask again later."};

    public magical_eight_ball(){}

    public static void respond(){

        System.out.print("\n" + respond(rng()));

    }

    protected static String respond(int index){

        if(index < 0 || num_responses <= index){

            return "";

        }

        return (responses[index]);

    }

    private static int rng(){

        return (int)(Math.random()*num_responses);

    }

}
