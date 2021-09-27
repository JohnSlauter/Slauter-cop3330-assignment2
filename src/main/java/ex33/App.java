package ex33;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 John Slauter
 */

import java.util.Scanner;

public class App {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        magical_eight_ball ball = new magical_eight_ball();

        System.out.print("What is your questions?\n> ");

        s.nextLine();

        ball.respond();

        s.close();

    }

}
