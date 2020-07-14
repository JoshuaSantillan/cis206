/*
  Author: Joshua Santillan
  Date: May 19th, 2019
  Filename: Records.java
  Description: Uses sort and Binary search to compare and find results
*/

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException; // used for files

public class Records {

  private ArrayList<Listing> n = new ArrayList<Listing>();
  private final int INDEX_MAX = 4;
        // ^ is used because the CSV file reads as 4 indexes per line anything > will cause an exception handle
  
  Comparator<Listing> compare_name = (Listing x, Listing y)->x.get_name().compareTo(y.get_name());
  
  Comparator<Listing> compare_num = (Listing x, Listing y)->x.get_number().compareTo(y.get_number());

  public Records(String filename)  throws FileNotFoundException
  {
    File file_in = new File(filename);
    Scanner in = new Scanner(file_in);
    int line_count = 0;

    while (in.hasNextLine()) {
      line_count++;
      String line = in.nextLine();
      String[] listingData = line.split(",");
            // splits comma seperated values, the first index is discarded.
      if (listingData.length > INDEX_MAX) { // the index cannot pass [3].
        in.close();
        throw new IllegalArgumentException("Error in file on line: " + line_count);
      }
      String name = listingData[1] + " " + listingData[2];
      n.add(new Listing(name, listingData[3]));
    }
    in.close();
  }


  public String search_name(String name)
  {
    Collections.sort(n, compare_name);
    int result = b_search_name(n, 0, n.size() - 1, name);
    if (result < 0) {
      return ("Name doesn't exist in records.");
    }else
      return (n.get(result).get_name() + "'s number: " + n.get(result).get_number());
  }

  public String search_num(String number)
  {
    Collections.sort(n, compare_num);
    int result = b_search_num(n, 0, n.size() - 1, number);
    if (result < 0) {
      return ("Number doesn't exist in records.");
    }else
      return (n.get(result).get_name() + "'s number: " + n.get(result).get_number());
  }

  public int b_search_name(ArrayList<Listing> n, int from, int to, String toFind)
  {
    if (from > to)
      return -1;
    int mid = (from + to) / 2;
    if (n.get(mid).get_name().equals(toFind))
      return mid;
    else if (n.get(mid).get_name().compareTo(toFind) < 0)
      return b_search_name(n, mid + 1, to, toFind);
    else
      return b_search_name(n, from, mid - 1, toFind);
  }

  public int b_search_num(ArrayList<Listing> n, int from, int to, String toFind)
  {
    if (from > to)
      return -1;
    int mid = (from + to) / 2;
    if (n.get(mid).get_number().equals(toFind))
      return mid;
    else if (n.get(mid).get_number().compareTo(toFind) < 0)
      return b_search_num(n, mid + 1, to, toFind);
    else
      return b_search_num(n, from, mid - 1, toFind);
  }
}
