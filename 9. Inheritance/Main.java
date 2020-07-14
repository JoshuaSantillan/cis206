/*
    Name: Joshua Santillan
    Date: May 12th 2019
    Filename: Main.java
    Description: Main class using our class and superclass functions to get and print an answer 
*/
import java.util.Scanner;

public class Main
{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        NumericQuestion test1 = new NumericQuestion();

        test1.set_problem("What is 20+5");
        test1.set_answer("25");
        test1.print();
        System.out.print("Answer: ");
        String ans = in.nextLine();
        System.out.println(test1.correct(ans));
        in.close();
    }
}

