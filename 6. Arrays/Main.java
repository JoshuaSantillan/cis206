/*
  name: Joshua Santillan
  Date: April 1st, 2019.
  Email: Santillanj125821@student.vvc.edu
  Description: Construct an array that resembles a movie theatre and input user for seating letting them pick 
                either a price or a row/collumn if available.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // construct a fixed 9 by 10 matrix 
        int[][] prices = new int[][] {
                { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
                { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
                { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
                { 10, 10, 20, 20, 20, 20, 20, 20, 10, 20 },
                { 10, 10, 20, 20, 20, 20, 20, 20, 10, 20 },
                { 10, 10, 20, 20, 20, 20, 20, 20, 10, 20 },
                { 20, 20, 30, 30, 40, 40, 30, 30, 20, 20 },
                { 20, 30, 30, 40, 50, 50, 40, 30, 30, 20 },
                { 30, 40, 50, 50, 50, 50, 50, 50, 40, 30 } 
        };

        Scanner ans = new Scanner(System.in);
        System.out.print("Would you like a seat or price? ");
        String option = ans.next();
              // use .equals to compare/check strins
        while (!(option.equals("seat") || option.equals("price"))) {
            System.out.print("Please enter (seat or price): ");
            option = ans.next();
        }

        boolean taken = false; // set for seat taken use later

         while (!taken) // while taken is set to false. 
         {
            if (option.equals("seat")) {
                System.out.print("Pick row: ");
                int row = ans.nextInt();
                System.out.print("Pick column: ");
                int column = ans.nextInt();
                if (prices[row][column] != 0) {
                    taken = true;
                    prices[row][column] = 0;

                    // prompts user to pick another seat if no -> end
                    System.out.println("Thank you for your purchase,  Would you like to pick another? (y/n)");
                        String x = ans.next();
                        if (x.equals("y")){
                          taken = false;
                        }
                        else {
                          taken = true;
                        }  
                } 
                else {
                    System.out.println("Seat is not available, pick another one: ");
                }
            } 
            else if (option.equals("price")) {
                System.out.print("Select price: ");
                int price = ans.nextInt();
                // iterating through the matrix 
                // using an ij loop to look for nearest desired price
                for (int i = 0; i < prices.length; i++) {
                    for (int j = 0; j < prices[i].length; j++) {
                        if (prices[i][j] == price) // when match is found
                        {
                            taken = true;
                            prices[i][j] = 0; // set to 0 
                            // [%d, %d] will print the int variables thats cool! 
                            System.out.printf("You purchased the seat [%d, %d]\n", i, j);
                           break; // break out of loop once they choose their seat
                        }
                    }
                    
                    if (taken) {
                      // reusing code above but for price, 
                      // pretty convient
                        System.out.println("Thank you for your purchase,  Would you like to pick another? (y/n)");
                        String x = ans.next();
                        if (x.equals("y")){
                          taken = false;
                        }
                        else {
                          taken = true;
                        }  
                        break;
                    }
                }
            }
        }

        System.out.println("Thank you for your business");
        // close the scanner
        ans.close();
    }
}
