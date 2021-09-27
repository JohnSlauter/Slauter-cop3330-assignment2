package ex37;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 John Slauter
 */

import java.util.Scanner;

import java.util.ArrayList;

public class App {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        int min_length, num_int, num_special;

        String password;

        ArrayList<ArrayList<Character>> lists = new ArrayList<ArrayList<Character>>();

        arraylist_setup(lists);

        System.out.print("What's the minimum length? ");

        min_length = s.nextInt();

        System.out.print("How many special characters? ");

        num_special = s.nextInt();

        System.out.print("How many numbers? ");

        num_int = s.nextInt();

        password = generate_password(lists, min_length, num_special, num_int);

        System.out.print(String.format("Your password is %s", password));

    }

    private static String generate_password(ArrayList<ArrayList<Character>> lists, int min_length, int num_special, int num_int){

        String password = "";

        int index, list_select, total_chars = count_elements(lists);

        int[] types_counter = {0, 0, 0};

        while(!check_password(password.length(), types_counter, min_length, num_special, num_int)){

            do {

                index = (int)(Math.random()*total_chars);

                list_select = list_of_index(lists, index);

            }while(needs_reroll(list_select, types_counter, num_int, num_special));

            index = adjust_index(lists, index, list_select);

            types_counter[list_select]++;

            password = password.concat(String.valueOf(lists.get(list_select).get(index)));

        }

        return password;

    }

    private static boolean needs_reroll(int list_index, int[] types_counter, int num_int, int num_special){

        if(list_index == 1 && types_counter[1] == num_int){

            return true;

        }

        else if(list_index == 2 && types_counter[2] == num_special){

            return true;

        }

        return false;

    }

    protected static int list_of_index(ArrayList<ArrayList<Character>> lists, int index){

        int list_num = -1, num_elements = 0;

        do{

            list_num++;

            num_elements += lists.get(list_num).size();

        }while(num_elements-1 < index);

        return list_num;

    }

    protected static int adjust_index(ArrayList<ArrayList<Character>> list, int index, int list_num){

        int num_elements = 0;

        for(int i = 0; i < list_num; i++){

            num_elements += list.get(i).size();

        }

        return index - num_elements;

    }

    protected static boolean check_password(int password_length, int[] types_counter, int min_length, int num_special, int num_int){

        if(password_length < min_length){

            return false;

        }

        if(!(types_counter[0] >= num_special + num_int)){

            return false;

        }

        if(!(types_counter[1] >= num_int)){

            return false;

        }

        if(!(types_counter[2] >= num_special)){

            return false;

        }

        return true;

    }

    protected static void arraylist_setup(ArrayList <ArrayList<Character>> lists){

        lists.add(char_list_setup());

        lists.add(int_list_setup());

        lists.add(special_list_setup());

    }

    private static ArrayList<Character> char_list_setup(){

        ArrayList<Character> list = new ArrayList<Character>();

        for(char c = 'a'; c <= 'z'; c++){

                list.add(c);

        }

        return list;

    }

    private static ArrayList<Character> int_list_setup(){

        ArrayList<Character> list = new ArrayList<Character>();

        for(char c = '0'; c <= '9'; c++){

            list.add(c);

        }

        return list;

    }

    private static ArrayList<Character> special_list_setup(){

        ArrayList<Character> list = new ArrayList<Character>();

        for(char c = '!'; c < '0'; c++){

            list.add(c);

        }

        for(char c = ':'; c < 'A'; c++){

            list.add(c);

        }

        for(char c = '['; c < 'a'; c++){

            list.add(c);

        }

        for(char c = '{'; c<= '~'; c++){

            list.add(c);

        }

        return list;

    }

    protected static int count_elements(ArrayList<ArrayList<Character>> list){

        int total = 0;

        for(ArrayList<Character> a : list){

            for(char c : a){

                total++;

            }

        }

        return total;

    }

}
