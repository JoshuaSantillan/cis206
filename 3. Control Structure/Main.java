/*
File: Main.java
Description: Checking for pair numbers
Author: Joshua Santillan
Email: santillanj125821@student.vvc.edu
Date of Creation: 2/15/2019
*/
import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
class Main 
{
	public static void main(String[] args)
	{
		System.out.println("Testing for two numbers of pairs\nPick four numbers one at a time");
		// I wanted to use an array list to test/practice my container skills
		ArrayList<Integer> p = new ArrayList<Integer>();	
		Scanner in = new Scanner (System.in);
		for ( int i = 0; i < 4; i++) {
			int n = in.nextInt();
			// adding the numbers entered into the array list
			p.add(n);
		}
			// when the array list = containers --> eiter two pairs or not two pairs
		if ((( p.get(0) == p.get(1) && (p.get(2) == p.get(3))) || p.get(0) == p.get(2) && p.get(1) == p.get(3) || p.get(0) == p.get(3) && p.get(1) == p.get(2))) {
				System.out.println("Two Pairs");
		}
		else{
			System.out.println("Not Two Pairs");
		}
	}
}
