/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.product;
public class Product {
// Recursive method to calculate the product of all numbers from 1 to n
public static int multiplyUpTo(int n) {
// Base case: if n is 1, return 1 (the product of numbers up to 1)
if (n <= 1) {
return 1;}
// Recursive case: multiply n by the product of numbers up to n-1
return n * multiplyUpTo(n - 1);}
public static void main(String[] args) {
int number = 5; 
int result = multiplyUpTo(number);
System.out.println("The product of all numbers from 1 to " + number + " is: " + result);
}
}

