package ex39;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 John Slauter
 */

import java.util.ArrayList;

import java.util.Collections;

import java.util.HashMap;

public class App {

    public static void main(String[] args){

        HashMap<String, Employee> employees = new HashMap<String, Employee>();

        ArrayList<String> last_name_database = new ArrayList<String>();

        int[] longest_length = {0, 0, 0};

        add_employees(employees, last_name_database, longest_length);

        Collections.sort(last_name_database);

        print_employees(last_name_database, employees, longest_length);

    }

    protected static void add_employees(HashMap<String, Employee> employees, ArrayList<String> last_name_database, int[] longest_length){

        add_employees_helper(new Employee("John", "Johnson", "Manager", "2016-12-31"), employees, last_name_database, longest_length);

        add_employees_helper(new Employee("Tou", "Xiong", "Software Engineer", "2016-10-05"), employees, last_name_database, longest_length);

        add_employees_helper(new Employee("Michaela", "Michaelson", "District Manager", "2015-12-19"), employees, last_name_database, longest_length);

        add_employees_helper(new Employee("Jake", "Jacobson", "Programmer"), employees, last_name_database, longest_length);

        add_employees_helper(new Employee("Jacquelyn", "Jackson", "DBA"), employees, last_name_database, longest_length);

        add_employees_helper(new Employee("Sally", "Webber", "Web Developer", "2015-12-18"), employees, last_name_database, longest_length);

    }

    private static void add_employees_helper(Employee temp, HashMap<String, Employee> employees, ArrayList<String> last_name_database, int[] longest_length){

        employees.put(temp.get_last_name(), temp);

        last_name_database.add(temp.get_last_name());

        update_longest_length(longest_length, temp);

    }

    protected static void update_longest_length(int[] longest_length, Employee e){

        if(full_name_length(e) > longest_length[0]){

            longest_length[0] = full_name_length(e);

        }

        if(e.getPosition().length() > longest_length[1]){

            longest_length[1] = e.getPosition().length();

        }

        if (e.getSeparation_date().length() > longest_length[2]){

            longest_length[2] = e.getSeparation_date().length();

        }

    }

    private static int full_name_length(Employee e){

        return (e.get_first_name().length() + e.get_last_name().length() + 1);

    }

    private static void print_employees(ArrayList<String> last_name_database, HashMap<String, Employee> map, int[] longest_length){

        Employee temp;

        if(longest_length[0] < "Name".length()){

            longest_length[0] = "Name".length();

        }

        if(longest_length[1] < "Position".length()){

            longest_length[1] = "Position".length();

        }

        if(longest_length[2] < "Separation Date".length()){

            longest_length[2] = "Separation Date".length();

        }

        System.out.print(String.format("Name%s| ", spacing(longest_length[0] - "Name".length() + 1)));

        System.out.print(String.format("Position%s| ", spacing(longest_length[1] + 1 - "Position".length())));

        System.out.print(String.format("Separation Date\n"));

        System.out.print(String.format("%s|%s|%s\n", dashes(longest_length[0]+1), dashes(longest_length[1]+2), dashes(longest_length[2]+1)));

        for(String s : last_name_database){

            temp = map.get(s);

            System.out.print(String.format("%s %s%s| ", temp.get_first_name(), temp.get_last_name(), spacing(longest_length[0] - full_name_length(temp) + 1)));

            System.out.print(String.format("%s%s| ", temp.getPosition(), spacing(longest_length[1] - temp.getPosition().length() + 1)));

            System.out.print(String.format("%s\n", temp.getSeparation_date()));
        }

    }

    private static String spacing(int n){

        if(n < 0){

            return "";

        }

        return " ".repeat(n);

    }

    private static String dashes(int n){

        if(n < 0){

            return "";

        }

        return "-".repeat(n);

    }

}