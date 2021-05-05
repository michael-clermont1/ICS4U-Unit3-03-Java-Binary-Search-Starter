/*
* This program generates 250 random numbers in an array
* and allows the user to search the array for a number.
*
* @author  Mr Coxall
* @version 0.5
* @since   2020-09-01
*/

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

class Main {
  /**
   * This function uses binary search to search an array for a specific number.
   */
  static int binarySearch(int[] userArray, int userNumber, 
                             int lowIndex, int highIndex) {
		// solve this function!
    
		return -1;
  }

  public static void main(String[] args) {
    System.out.println("Binary Search Program");
		try {
      // Initializing the random class
      Random randNumber = new Random();

      // Initializing array of numbers
      int[] randomNumberArray = new int [250];

      // Adding numbers to the array
      for (int counter = 0; counter < randomNumberArray.length; counter++) {
        randomNumberArray[counter] = randNumber.nextInt(999) + 1;
      }

      // Sorting the array
      int[] numberArray = randomNumberArray;
			Arrays.sort(numberArray);
			
			System.out.print("\nHere is the sorted list of numbers:\n");
			for (int element: numberArray) {
				String padded = String.format("%03d" , element);
				System.out.print(padded + ", ");    
      }
			System.out.print("\n\n");

      // Getting user input as to what number they wish to search for
      Scanner userInput = new Scanner(System.in);
      System.out.print("What number are you searching for in the array");
      System.out.print(" (integer between 0 and 999): ");
      int searchNumber = userInput.nextInt();
			userInput.close();
      System.out.println();

      // Ensuring the user inputs an appropriate integer
      if (searchNumber > 999 || searchNumber < 0) {
        throw new Exception();
      } else {
        // Using binary search to find the user's chosen number in the array
        int searchResult = binarySearch(numberArray, searchNumber, 
                                           0, numberArray.length - 1);

        // Outputing the results of the search
        System.out.println();
        System.out.println("Your number is in index: " + searchResult);
      }

      // Catches and tells the user that an error occured
    } catch (Exception e) {
      System.out.println();
      System.out.println("ERROR: Invalid Input");
    } 
  }
}
