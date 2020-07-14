/*
    Name: Joshua Santillan
    Date: May 12th 2019
    Filename: NumericQuestion.java
    Description: Class inhertics the question class as a super class and will print a boolean answer 
 */

public class NumericQuestion extends Question{
    private double differ = 0.01;
    public NumericQuestion()
    {
        super(); // used to constructor a super class in Numeric Question's default
    }

    public boolean correct(String in){

        double ans = Double.parseDouble(this.get_answer());
        double input = Double.parseDouble(in);
        return Math.abs(ans - input) <= differ;    
    }

}
