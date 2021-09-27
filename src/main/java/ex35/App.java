package ex35;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 John Slauter
 */

import java.util.Scanner;

import java.util.ArrayList;

public class App {

    public static void main(String[] args){

        ArrayList<String> list = read_input();

        System.out.print(String.format("The winner is... %s.", list.get(rng(list.size()))));

    }

    protected static ArrayList<String> read_input(){

        ArrayList<String> list = new ArrayList<String>();

        Scanner s = new Scanner(System.in);

        String temp;

        do{

            temp = s.nextLine();

            if(temp.equals("")){

               break;

            }

            list.add(temp);

        }while(!temp.equals(""));

        return list;

    }

    protected static int rng(int size){

        return (int)(Math.random()*size);

    }

}
