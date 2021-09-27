package ex40;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 John Slauter
 */

public class Employee {

    private String first_name, last_name, position, separation_date;

    public Employee(String first_name, String last_name, String position, String separation_date) {

        this.first_name = first_name;

        this.last_name = last_name;

        this.position = position;

        this.separation_date = separation_date;

    }

    public Employee(String first_name, String last_name, String position){

        this(first_name, last_name, position, "");

    }

    public String get_first_name(){

        return first_name;

    }

    public String get_last_name(){

        return last_name;

    }

    public String getPosition(){

        return position;

    }

    public String getSeparation_date(){

        return separation_date;

    }

}
