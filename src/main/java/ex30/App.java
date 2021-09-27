package ex30;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 John Slauter
 */

public class App {

    private static final int MAX = 12;

    public static void main(String[] args){

        System.out.print(create_table(MAX));

    }

    protected static String create_table(int dimension){

        String table = "";

        for(int i = 1; i <= dimension; i++){

            for(int j = 1; j <= dimension; j++){

                table = table.concat(create_space(i * j, dimension) + i * j);

            }

            table = table.concat("\n");

        }

        return table;

    }

    protected static String create_space(int num, int dimension){

        int num_spaces = 2 + num_places(dimension*dimension) - num_places(num);

        return " ".repeat(num_spaces);

    }

    protected static int num_places(int num){

        int place_counter = 0;

        while(num > 0){

            place_counter++;

            num /= 10;

        }

        return place_counter;

    }

}
