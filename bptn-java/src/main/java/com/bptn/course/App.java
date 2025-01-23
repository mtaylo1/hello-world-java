package com.bptn.course;



import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
    	   // Step 1: Take user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine(); // Read the input string
        
        String r = ""; // Variable to store reversed string

        // Step 2: Reverse the string using a loop (without charAt)
        for (int i = s.length() - 1; i >= 0; i--) {
            r += s.substring(i, i + 1); // Extracts substring (one character) and adds to reversed string
        }

        // Step 3: Print original and reversed string
        System.out.println("Original String: " + s);
        System.out.println("Reversed String: " + r);

        // Step 4: Check if it's a palindrome
        if (s.equalsIgnoreCase(r)) { // Case-insensitive comparison
            System.out.println("The string is a palindrome!");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }

        sc.close(); // Close scanner
    }
}