/*
  Name: Joshua Santillan
  Date: 4/4/2019
  Description: Midterm Project reading and printign data using ArrayList
  Filename: Main.java
*/
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
  private static Scanner data = new Scanner(System.in); // ray told me declarign scanner here prevents me from having to reuse it throughout the program
   public static void main(String[] args) {
   ArrayList<String> s = new ArrayList<String>();

       while(true){
        
         // menu system:

           System.out.println("1) Add a name to the list \n2) Search for a name \n3) See available names \n4) Exit");
           int menu_item = data.nextInt();
           if(menu_item == 1){ // add names to list
           add(s);
           }
           else if(menu_item == 2){ // search names in list
           search(s);
           }
           else if(menu_item == 3){ // print the list
           print(s);
           }
           else if(menu_item == 4){ // break 
             System.out.println("Have a good day, goodbye.");
           break; 
           }
       }
   }
   public static void add(ArrayList<String> s){
       System.out.print("Enter Name: ");
       String name = data.next(); // how do you use nextLine(); wasnt working :/
       s.add(name); //push back into list
   }
   public static void search(ArrayList<String> s){
       System.out.println("Enter a name to search for:");
       String name = data.next(); 
       int index = s.indexOf(name);
       if(index > -1 ){ // if the index exist
       System.out.println("The name was found at the index: "+index);
       }
       else
       System.out.println("The name you were searching for is not in the list.");
   }
   public static void print(ArrayList<String> s){
     // just prints the list to see what is in it
       for(int i=0; i<s.size(); i++){
           System.out.println(s.get(i));
       }
   }
}
