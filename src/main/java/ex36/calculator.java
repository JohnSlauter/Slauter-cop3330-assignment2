package ex36;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 John Slauter
 */

import java.util.ArrayList;

public class calculator {

    public calculator(){}

    public static double average(ArrayList<Integer> list){

        int summation = 0;

        for(int i : list){

            summation += i;

        }

        return ((double)summation) / list.size();

    }

    public static int min(ArrayList<Integer> list){

        if(list.isEmpty()){

            return -1;

        }

        int stor = list.get(0);

        for(int i = 1; i < list.size(); i++){


            if(list.get(i) < stor){

                stor = list.get(i);

            }

        }

        return stor;

    }

    public static int max(ArrayList<Integer> list){

        if(list.isEmpty()){

            return -1;

        }

        int stor = list.get(0);

        for(int i = 1; i < list.size(); i++){


            if(stor < list.get(i)){

                stor = list.get(i);

            }

        }

        return stor;

    }

    public static double std(ArrayList<Integer> list){

        double average, summation = 0.0;

        average = average(list);

        for(int i : list){

            summation += square(i - average);

        }

        summation /= list.size();

        return Math.sqrt(summation);

    }

    private static double square(double n){

        return n*n;

    }

}
