package ex40;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 John Slauter
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class App {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        String search_criteria;

        HashMap<String, Employee> employees = new HashMap<String, Employee>();

        int[] longest_length = {0, 0, 0};

        add_employees(employees, longest_length);

        System.out.print("Enter a search string: ");

        search_criteria = s.nextLine();

        print_search(search_criteria, employees, longest_length);

        s.close();

    }

    private static void print_search(String s, HashMap<String, Employee> map, int[] longest_length){

        ArrayList<String> results = search(s, map);

        print_employees(results, map, longest_length);

    }

    protected static ArrayList<String> search(String s, HashMap<String, Employee> map){

        ArrayList<String> results = new ArrayList<String>();

        for(Employee e : map.values()){

            if((e.get_first_name() + " " + e.get_last_name()).contains(s)){

                results.add(e.get_last_name());

            }

        }

        return results;

    }

    protected static void add_employees(HashMap<String, Employee> employees, int[] longest_length){

        add_employees_helper(new Employee("John", "Johnson", "Manager", "2016-12-31"), employees, longest_length);

        add_employees_helper(new Employee("Tou", "Xiong", "Software Engineer", "2016-10-05"), employees, longest_length);

        add_employees_helper(new Employee("Michaela", "Michaelson", "District Manager", "2015-12-19"), employees, longest_length);

        add_employees_helper(new Employee("Jake", "Jacobson", "Programmer"), employees, longest_length);

        add_employees_helper(new Employee("Jacquelyn", "Jackson", "DBA"), employees, longest_length);

        add_employees_helper(new Employee("Sally", "Webber", "Web Developer", "2015-12-18"), employees, longest_length);

    }

    private static void add_employees_helper(Employee temp, HashMap<String, Employee> employees, int[] longest_length){

        employees.put(temp.get_last_name(), temp);

        update_longest_length(longest_length, temp);

    }

    private static void update_longest_length(int[] longest_length, Employee e){

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