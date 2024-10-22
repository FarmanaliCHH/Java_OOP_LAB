/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sum;
import java.util.Scanner;

public class Sum {
// Method to compute the sum of odd numbers less than input using recursion
public static int ComputeOddSum(int input) {
if (input <= 0) {
            return 0; // Base case: if input is less than or equal to 0, return 0
        }
        // If the input is odd, include it in the sum; otherwise, skip it
        return (input % 2 != 0 ? input : 0) + ComputeOddSum(input - 1);
    }

    // Method to compute the sum of even numbers less than input
    public static int ComputeEvenSum(int input) {
        if (input <= 0) {
            return 0; // Base case: if input is less than or equal to 0, return 0
        }
        // If the input is even, include it in the sum; otherwise, skip it
        return (input % 2 == 0 ? input : 0) + ComputeEvenSum(input - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        // Loop to prompt user for input until a negative number is entered
        do {
            System.out.print("Enter a positive number (or a negative number to exit): ");
            number = scanner.nextInt();

            if (number >= 0) {
                // Calculate sums and display the results
                int oddSum = ComputeOddSum(number);
                int evenSum = ComputeEvenSum(number);
                
                System.out.println("Sum of odd numbers less than " + number + ": " + oddSum);
                System.out.println("Sum of even numbers less than " + number + ": " + evenSum);
            }

        } while (number >= 0); // Continue until a negative number is entered

        System.out.println("Exiting the program.");
        scanner.close();
    }
}

