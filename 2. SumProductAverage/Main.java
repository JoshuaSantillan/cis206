/*
File: Main.java
Description: Doing some Math equations
Author: Joshua Santillan
Email: santillanj125821@student.vvc.edu
Date of Creation: 2/15/2019
*/
import java.util.Scanner;
import java.math.*;


class Main
{
   public static void main(String[] args)
   {

     Scanner in = new Scanner(System.in); 
     System.out.print("Enter the first number: ");
     int first = in.nextInt();
     System.out.print("Enter the second number: ");
     int second = in.nextInt();
     in.close();


       int sum = first + second;
       int difference = first - second;
       int product = first * second; 
       int average = ((first + second) / 2);
       int distance = Math.abs(first - second);
       int max = (Math.max(first,second));
       int min = (Math.min(first,second));


     System.out.println("Sum: " + sum + "\nDifference: " + difference + "\nProduct: " + product + "\nAverage: " + average + "\nDistance: " + distance + "\nMaximum: " + max + "\nMinimum: " + min);
  }

}
