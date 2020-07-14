/*
  Author: Joshua Santillan
  Date: May 19th, 2019
  Filename: Listing.java
  Description: used to get user data.
*/

public class Listing {
  
  private String m_name, m_num;

  public Listing(String name, String number)
  {
    m_name = name;
    m_num = number;
  }

  public String get_name()
  {
    return m_name;
  }

  public String get_number()
  {
    return m_num;
  }
}
