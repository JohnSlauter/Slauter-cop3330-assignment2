package ex27;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 John Slauter
 */

import java.util.Scanner;

public class App {

    public static void main(String[] args){

        String first_name, last_name, ID, ZIP, out;

        EmployeeValidator ev = new EmployeeValidator();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first name: ");

        first_name = sc.nextLine();

        System.out.print("Enter the last name: ");

        last_name = sc.nextLine();

        System.out.print("Enter the ZIP code: ");

        ZIP = sc.nextLine();

        System.out.print("Enter the employee ID: ");

        ID = sc.nextLine();

        out = ev.validateEmployee(first_name, last_name, ID, ZIP);

        System.out.print(out);

        sc.close();

    }

}
