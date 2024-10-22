/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numbersum;
public class NumberSum {
public static void main(String[] args) {
int start = 1;
int end = 20;
int sum = sumBetween(start, end);
System.out.println("The sum of numbers between " + start + " and " + end + " is: " + sum);
}
// Recursive function to compute the sum between two integers
public static int sumBetween(int a, int b) {
// Base case: if a is greater than b, return 0
if (a > b) {
return 0;
}
// Recursive case: add the current number (a) to the sum of the rest
return a + sumBetween(a + 1, b);
}
}

