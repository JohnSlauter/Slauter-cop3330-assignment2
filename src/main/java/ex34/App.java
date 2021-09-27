package ex34;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 John Slauter
 */

import java.util.Scanner;

public class App {

    public static void main(String[] args){

        String[] employees = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};

        Scanner s = new Scanner(System.in);

        String target;

        print_employee_array(employees);

        System.out.print("\n\nEnter an employee name to remove: ");

        target = s.nextLine();

        System.out.print("\n");

        employees = remove_employee(employees, target);

        print_employee_array(employees);

        s.close();

    }

    protected static void print_employee_array(String[] employees){

        System.out.print(String.format("There are %d employees", employees.length));

        for(int i = 0; i < employees.length; i++){

            System.out.print(String.format("\n%s",employees[i]));

        }


    }

    protected static String[] remove_employee(String[] employees, String target){

        int index = index_of_employee(employees, target);

        if(index < 0){

            return employees;

        }

        String[] new_employee_array = new String[employees.length-1];

        for(int i = 0; i < employees.length; i++){

            if(i < index){

                new_employee_array[i] = employees[i];

            }

            else if(i > index){

                new_employee_array[i-1] = employees[i];

            }

        }

        return new_employee_array;

    }

    protected static int index_of_employee(String[] employees, String target){

        for (int i = 0; i < employees.length; i++){

            if(employees[i].equals(target)){

                return i;

            }

        }

        return -1;

    }

}
