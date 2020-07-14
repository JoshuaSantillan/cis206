/*
  Author: Joshua Santillan
  Date: May 19th, 2019
  Filename: Main.java
  Description: Main java file using a menu that takes info from user
*/
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

public class Main
{
public static void main(String[] args) throws FileNotFoundException
{
	Scanner in = new Scanner(System.in);
	String filename = ("MOCK_DATA.csv");
	Records recs = new Records(filename);
	boolean menu = true;

	while (menu) {
		System.out.println("Search the Records:\n" +
				   "1) Search for name\n" +
				   "2) Search for number\n" +
				   "3) Exit");
		String ans = in.nextLine();
		if (ans.equals("1")) {
			System.out.println("Enter the persons full name (First Last)");
			String name = in.nextLine();
			System.out.println(recs.search_name(name));
		} else if (ans.equals("2")) {
			System.out.println("Enter person's phone number in the following format:\n" +
					   "###-###-####");
			String num = in.nextLine();
			System.out.println(recs.search_num(num));
		} else {

			menu = false;
		
    }
	}
	in.close();
}
}
