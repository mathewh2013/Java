// Mathew Harrison

// Write a program that reads a line of text input by the user and places each 
// word in a TreeSet. Print the elements of the TreeSet to the screen. 
// This will cause the elements to be printed in ascending order.

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetUse {
   public static void main(String[] args) 
   {
// Set Scanner and tree for user input:
	   Scanner sc = new Scanner(System.in);
       TreeSet<String> tree = new TreeSet<String>();
       
// Prompt user for a line of text containing characters:
       System.out.println("Enter line: ");
       String str = sc.nextLine();
       
// Put words into tree:
       for (String s : str.split(" "))
           tree.add(s);
       
// Print tree set use:
       System.out.println(tree);
   }
}