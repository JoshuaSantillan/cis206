/*
Name: Joshua Santillan
Date: 3/14/19
Email: santillanj12582@student.vvc.edu
Description: Scrambles Words and concatenates them together 

*/

import java.util.Random;

class Main {
public static String scramble(String word)
{

int wl = word.length();
int first, last;
  
 /* Check if word length of string is greater than 3
 If the word length is > 3 generate 2 indexes to swap*/
if(wl > 3)
{
// generating 2 random numbers
Random random = new Random();
first = 1 + random.nextInt(wl-2); // 1  (so not 0) + random number of the word lenghth and minus 2 (so not the last)
last = first; // we want these to do the same thing with different indexes.
// System.out.println(last + "\n" + first); unit test to see which chars are beign swapped
while(first == last)
last = 1 + random.nextInt(wl-2); // if first index = second 
  

char end = word.charAt(last); // char position at random generated
word = word.substring(0,last) + word.charAt(first) + word.substring(last+1);
//starting at 0 ending at last(random generated -2) added to first and then swapped agian with last +1
word = word.substring(0,first) + end + word.substring(first+1);
// above 2 lines is what swaps characters around never touching the first and last  
}
  
return word;
}
  
public static void main(String[] args) {
System.out.println(scramble("Hello, my name is Josh"));
System.out.println(scramble("hey"));
System.out.println(scramble("apple "));
System.out.println(scramble("methods"));
}
}
