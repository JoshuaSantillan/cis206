/*
  Name: Joshua Santillan
  Date: Tue, Jun 4th 2019
  Filename: Mountain.java
  Description: Mountain class and functions which will create the functions to  create a mountain object which is used to print from an array list of mountain   objects and finding the lowest elevataion of them.
*/
import java.util.*;
import java.io.*;

public class Mountain{

  private String m_name, m_country;
  private Double m_Ele = 0.0; // double so we can convert to meters

  public Mountain(String name, String country, Double Ele){
    m_name = name;
    m_country = country;
    m_Ele = Ele;
  }
  
  public void setName(String name){
    m_name = name;
  }
  
  public void setCountry(String country){
    m_country = country;
  }
  
  public void setEle(Double Ele){
    m_Ele = Ele;
  }
  
  public String getName(){
    return m_name;
  }
  
  public String getCountry(){
    return m_country;
  }
  
  public Double getEle(){
    return m_Ele;
  }
  
  public Double toMeters(){
    final Double FEET_PER_METER = 3.2808;
    Double Ele_in_meters = (this.getEle() / FEET_PER_METER);
    return Ele_in_meters;
  }
  public void print(ArrayList<Mountain> m){

    	Double lowest_Ele = minEle(m); // Min Ele
    System.out.println("╔═════════════════════════════════════════════════════════════════════════════════════╗");
    System.out.printf("%-30s %-30s %10s %10s %n", " MOUNTAIN", "COUNTRY", "Elevation FT", "Elevation M");
    System.out.println("══════════════════════════════════════════════════════════════════════════════════════");
    for(Mountain mt : m){
      Double meter_Ele = mt.toMeters();
      System.out.printf("%-30s %-30s %10.0f %10.2f %n", mt.getName(), mt.getCountry(), mt.getEle(), meter_Ele);
        System.out.println("══════════════════════════════════════════════════════════════════════════════════════"); 
  }
  for(Mountain mt : m){
    if (mt.getEle() == lowest_Ele){
      System.out.println("The Lowest mountain is: " + mt.getName() + " at Ele: " + mt.getEle()); 
    }
  }
	System.out.println("╚═════════════════════════════════════════════════════════════════════════════════════╝"); 

}

public static Double minEle(ArrayList<Mountain> m){

  Double min_Ele = 50000.0;

	for (Mountain mt : m) {
		if (mt.getEle() < min_Ele) {
			min_Ele = mt.getEle();
		}
	}
	return min_Ele;
}

  }

