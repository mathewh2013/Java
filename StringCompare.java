// Mathew Harrison
// Write a program that uses String method regionMatches to compare two strings input by the user. 
// The program should prompt the user to enter two strings, the starting index in the first string, 
// the starting index in the second string, and the number of characters to be compared. 
// The program should print whether or not the strings are equal. (Ignore the case of the characters 
// during comparison.) 

import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {

          Scanner input = new Scanner(System.in);
            int firstIndex;
            int secondIndex;

		// First String prompt and input
            System.out.print("Enter first string:"); 
		// Assign string to user input
                String stringOne = input.nextLine(); 
		// Second String prompt and input
            System.out.print("Enter second string:"); 
		// Assign string to user input
                String stringTwo = input.nextLine(); 

		// Starting index for first string:
            System.out.print("Enter starting index for first string:"); 
                 firstIndex = input.nextInt(); 
		// Starting index for second string:
            System.out.print("Enter starting index for second string:"); 
                 secondIndex = input.nextInt(); 	
		// Prompt for number of characters:
            System.out.print("Enter number of characters to be compared:"); 
                int numCompared = input.nextInt(); 
		// Bool:
            boolean results = stringOne.regionMatches(firstIndex,
                    stringTwo, secondIndex, numCompared);   
		//If true print results
            if (results)
                System.out.println(true);
            else
                System.out.println(false);
    }
}