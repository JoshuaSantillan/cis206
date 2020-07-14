/*
  Author: Joshua Santillan
  Date: 5/25/19
  Filename: Main.java
  Description: Sieve of erathostenes getting prime numbers with a set

*/
import java.io.*;
import java.util.*;


class Main
{
public static void Sieve(Set prime, int n){
    for(int i = 2; i*i <= n; i++){
     for(int j = i; i*j <= n; j++)   
       prime.remove((Integer)(i*j));
    }
}
public static void main(String[] args){
    
    int n;
    System.out.print("Enter the value of n: ");
    Scanner in = new Scanner(System.in);
    n = in.nextInt();
    
    Set prime = new TreeSet(); 
    for(int i = 2; i <= n; i++)   //Populate all #'s 2-n
    prime.add(i);
    Sieve(prime, n);
    
    System.out.println("Primes between 2 and "+n+" are: "+prime); //Print
    in.close();
}

}
