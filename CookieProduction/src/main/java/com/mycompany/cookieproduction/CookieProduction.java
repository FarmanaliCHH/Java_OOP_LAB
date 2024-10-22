package com.mycompany.cookieproduction;
import java.util.Scanner;
public class CookieProduction {
public static void main(String[] args) {
// Initialize constants
final int COOKIES_PER_BOX = 12;
final int BOXES_PER_CARTON = 24;
final double BOX_PRICE = 1.14;
final double LEFTOVER_BOX_PRICE = 0.57;
// Input for the total number of cookies produced
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the number of cookies produced: ");
int totalCookies = scanner.nextInt();
// Calculate the number of full boxes
int fullBoxes = totalCookies / COOKIES_PER_BOX;
int remainingCookies = totalCookies % COOKIES_PER_BOX;
// Calculate the number of cartons and leftover boxes
int fullCartons = fullBoxes / BOXES_PER_CARTON;
int leftoverBoxes = fullBoxes % BOXES_PER_CARTON;
// Calculate total money made
double totalMoneyMade = (fullBoxes * BOX_PRICE) + (leftoverBoxes *         LEFTOVER_BOX_PRICE);
// Output results
System.out.println("Total Cookies Produced: " + totalCookies);
System.out.println("Number of Full Boxes: " + fullBoxes);
System.out.println("Number of Full Cartons: " + fullCartons);
System.out.println("Number of Leftover Boxes: " + leftoverBoxes);
System.out.println("Number of Remaining Cookies (Given Away for Free): " +                
remainingCookies);
        System.out.printf("Total Money Made: $%.2f", totalMoneyMade);
        scanner.close();
       }}
