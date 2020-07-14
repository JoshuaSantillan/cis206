/*
  Name: Joshua Santillan
  Date: Tue, Jun 4th 2019
  Filename: Main.java
  Description: Main file which makes a new mountain and passes them to be printed.
*/
import java.util.*;
import java.io.*;
public class Main
{
public static void main(String[] args) {
  
	ArrayList<Mountain> info = new 
  ArrayList<Mountain>();
    info.add(new Mountain("Chimborazo", "Ecuador", 20549.0));
	info.add(new Mountain("Matterhorn", "Switzerland", 14692.0));
  info.add(new Mountain("Olympus", "Greece (Macedonia)", 9573.0));
	info.add(new Mountain("Everest", "Nepal", 29029.0));
  info.add(new Mountain("Mount Marcy - Adirondacks", "United States", 5344.0));
	info.add(new Mountain("Mount Mitchell - Blue Ridge", "United States", 6684.0));
  info.add(new Mountain("Zugspitze", "Switzerland", 9719.0));

  Mountain mymtn = new Mountain("","", 0.0); // blank mtn object to pass through print function
  mymtn.print(info);

}

}
