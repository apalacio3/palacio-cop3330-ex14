/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Angelica Palacio
 */
package oop.example;
import java.text.DecimalFormat;
import java.util.Scanner;

public class TaxCalculator
{
    public static void main( String[] args )
    {
        System.out.print( "What is the order amount? " );

        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        double subtotal = Double.parseDouble(a);

        System.out.print( "What is the state? " );
        String state = input.nextLine();

        double total;
        double tax;
        DecimalFormat d = new DecimalFormat("#.##");
        String output;

        total = subtotal;
        output = "The total is $" + d.format(total) + ".\n";

        if(state.equals("WI"))
        {
            tax = subtotal * 0.055;
            total = subtotal + tax;

            output = "The subtotal is $" + d.format(subtotal) + ".\n"
                    + "The tax is $" + d.format(tax) + ".\n"
                    + "The total is $" + d.format(total) + ".\n";

        }

        System.out.println(output);
    }

}
