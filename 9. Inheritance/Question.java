/*
    Name: Joshua Santillan
    Date: May 12th 2019
    Filename: Question.java
    Description: Question class that will set a problem, it's answer and will return it.
*/
public class Question{

    private String problem; 
    private String answer;
      
    public Question(){
        
        problem = "";
        answer = "";

    }

    public void set_problem(String text){
        
        problem = text;
    }
    
    public void set_answer(String ans){
        
        answer = ans;
    }
    
    public String get_answer(){
        
        return answer;
    }
    
    public boolean correct(String check){
        
        return check.equals(answer);
    }
    
    public void print(){
        
        System.out.println(problem);
    }

}


