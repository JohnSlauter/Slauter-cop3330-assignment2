package ex27;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 John Slauter
 */

public class EmployeeValidator {

    public EmployeeValidator(){}

    public String validateEmployee(String first_name, String last_name, String ID, String ZIP){

        String out = "";

        int temp = validate_first_name(first_name);

        if(temp != 0){

            out = out.concat("The first name must be at least 2 characters long.\n");

            if(temp > 1){

                out = out.concat("The first name must be filled in.\n");

            }

        }

        temp = validate_last_name(last_name);

        if(temp != 0){

            out = out.concat("The last name must be at least 2 characters long.\n");

            if(temp > 1){

                out = out.concat("The last name must be filled in.\n");

            }

        }

        if(!validate_ID(ID)){

            out = out.concat("The employee ID must be in the format of AA-1234.\n");

        }

        if(!validate_ZIP(ZIP)){

            out = out.concat("The zipcode must be a 5 digit number.");

        }

        out = last_new_line_check(out);

        if(out.isEmpty()){

            out = "There were no errors found.";

        }

        return out;

    }

    protected int validate_first_name(String first_name){

        if(first_name.isEmpty()){

            return 2;

        }

        if(first_name.length() < 2){

            return 1;

        }

        return 0;

    }

    protected int validate_last_name(String last_name){

        if(last_name.isEmpty()){

            return 2;

        }

        if(last_name.length() < 2){

            return 1;

        }

        return 0;

    }

    protected boolean validate_ID(String ID){

        if(ID.length() != 7){

            return false;

        }

        for(int i = 0; i < 2; i++){

            if(ID.toLowerCase().charAt(i) < 'a' || 'z' < ID.toLowerCase().charAt(i)){

               return false;

            }

        }

        if(ID.charAt(2) != '-'){

            return false;

        }

        for(int i = 3; i < ID.length(); i++){

            if(ID.charAt(i) < '0' || '9' < ID.charAt(i)){

                return false;

            }

        }

        return true;

    }

    protected boolean validate_ZIP(String ZIP){

        if(ZIP.length() != 5){

            return false;

        }

        for(int i = 0; i < ZIP.length(); i++){

            if(ZIP.charAt(i) < '0' || '9' < ZIP.charAt(i)){

                return false;

            }

        }

        return true;

    }

    protected static String last_new_line_check(String str){

        if(str.isEmpty()){

            return "";

        }

        if(str.lastIndexOf('\n') == str.length()-1){

            str = str.substring(0, str.length()-1);

        }

        return str;

    }

}
