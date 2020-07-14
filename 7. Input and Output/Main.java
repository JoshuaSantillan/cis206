/*
  Name: Joshua Santillan
  Date: April 30 2019
  Filename: Main.Java
  Description: Main.java used for files
  Email: santj96@gmail.com
*/

import java.util.Scanner;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
			
		String line;
		double total = 0;

		FileReader read = new FileReader("test.txt");
		BufferedReader buffer = new BufferedReader(read);
		System.out.println("Name\t\tService\t\tAmount\t\tDate");

		line = buffer.readLine();
		// need to implement a delimiter breaker below

		while(line != null){
			String delim[] = line.split(";");
			for(int i = 0; i < delim.length; i++){
				System.out.print(delim[i] + "\t");
				if(i == 1) {
					//System.out.print("\t");
				}
			}
			
			total += Double.parseDouble(delim[2]);
			System.out.println();
			line = buffer.readLine();

			System.out.println("Total Money: " + total);
		}

  }
	
		
}
