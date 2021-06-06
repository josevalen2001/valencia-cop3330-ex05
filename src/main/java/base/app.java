package base;
import java.sql.SQLOutput;
import java.util.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jose Valencia
 */

public class app {

    public static void main(String[] args) {
        Scanner newScan = new Scanner(System.in);

        //Input
        System.out.print("What is the first number? ");
        String input1 = newScan.nextLine();

        System.out.print("What is the second number? ");
        String input2 = newScan.nextLine();

        //Turn string into ints
        int num1 = Integer.parseInt(input1);
        int num2 = Integer.parseInt(input2);

        //Calculations
        int sum = num1+num2;
        int difference = num1-num2;
        int product = num1*num2;
        int quotient = num1/num2;

        //Output
        System.out.println(num1 + " + " + num2 + " = " + sum + "\n" +
                    num1 + " - " + num2 + " = " + difference + "\n" +
                    num1 + " * " + num2 + " = " + product + "\n" +
                    num1 + " / " + num2 + " = " + quotient);



    }

}
