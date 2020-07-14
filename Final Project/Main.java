/*
 *  Auhtor: Joshua Santillan
 *  Date: June 8th, 2019
 *  Description: Program reads in data and saves it to file names and can add/delete items
 *  Filename: Main.java
*/
import java.io.*;
import java.util.*;
public class Main
{
private static Scanner input  = new Scanner(System.in);
public static void main(String[] args) throws FileNotFoundException
{
	ArrayList<String> arr = new ArrayList<String>();

	f_open(arr);
	menu(arr);
	input.close();

}

public static ArrayList<String> f_open(ArrayList<String> arr) throws FileNotFoundException
{
	System.out.println("*Select a number*:\n" +
			   "\t1. Open Existing file\n" +
			   "\t2. Create a new file");
	String ans = input.nextLine();
	if (ans.equals("1")) {
		System.out.println("Enter existing f_name: ");
		String f_name = input.nextLine();
		File inputFile = new File(f_name);
		Scanner in = new Scanner(inputFile);
		while (in.hasNextLine()) {
			String line = in.nextLine();
			arr.add(line);
		}
		in.close();
	}
	return arr;
}
public static void menu(ArrayList<String> arr) throws FileNotFoundException
{
	boolean menu = true;

	while (menu) {
		System.out.println("Select one of the options below:\n" +
				   "\t1. Add a line\n" +
				   "\t2. Delete a line\n" +
				   "\t3. Save to file\n" +
				   "\t4. Print file lines\n" +
				   "\t5. Exit");

		String ans = input.nextLine();

		if (ans.equals("1")) {
			add(arr);
      }
      else if (ans.equals("2")) {
			delete(arr);
		}
    else if (ans.equals("3")) {
			save(arr);
		}
    else if (ans.equals("4")) {
			print(arr);
		}
    else if (ans.equals("5")){
      System.out.println("Closing the program, goodbye.");
      menu = false; // close menu
    }
    else  {
      System.out.println("Unexpected error, closing program! ");
			menu = false; // close the menu.
		}
	}
}

public static ArrayList<String> add(ArrayList<String> arr)
{
	System.out.println("Enter your line!");
	String newline = input.nextLine();
	arr.add(newline);
	return arr;
}

public static ArrayList<String> delete(ArrayList<String> arr)
{
	System.out.println("Delete\n" +
			   "\t1. last line\n" +
			   "\t2. specific line?");
	String ans = input.nextLine();
	if (ans.equals("1")) {
		arr.remove(arr.size() - 1); // deletes the last element in the array
	}else if (ans.equals("2")) {
		System.out.println("Pick a line number to delete: ");
		int index = input.nextInt();
		input.nextLine();
		arr.remove(index);
    System.out.println("Line " + index + " was deleted.");
	}
	return arr;
}
public static void save(ArrayList<String> arr) throws FileNotFoundException {
	System.out.println("Enter a file name to save as: ");
	String f_name = input.nextLine();
	PrintWriter outputFile = new PrintWriter(f_name);
	System.out.println("Saving your information to: " + f_name);
	for (String lines : arr) { // enchanced for loop makes it easier to iterate! 
		int linecount = 0;
		outputFile.println(linecount + ") " + lines);
		linecount++;
	}
	outputFile.close();
}
public static void print(ArrayList<String> arr){
	int line_count = 0; // start our line count at 0 since array index starts at 0
	for (String lines : arr) {
		System.out.println(line_count + ". " + lines);
		line_count++;
	}
}
}
