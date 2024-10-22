package com.mycompany.pulley;
import java.util.Scanner;
public class Pulley {
// Method to calculate RPM of the second pulley
public static double calculatePulleySpeed(double diameter1, double diameter2, double RPM1) {
return (diameter1 / diameter2) * RPM1;
}
// Method to calculate the weight lifted in a multiple pulley system
public static double calculateWeightLifted(double forceExerted, int numberOfUpRopes) {
return forceExerted * numberOfUpRopes;
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
// Part 1: Pulley Speed Calculation
System.out.println("Pulley Speed Calculation:");
System.out.print("Enter the diameter of the first pulley (in meters): ");
double diameter1 = scanner.nextDouble();
System.out.print("Enter the diameter of the second pulley (in meters): ");
double diameter2 = scanner.nextDouble();
System.out.print("Enter the RPM of the first pulley: ");
double RPM1 = scanner.nextDouble();
// Calculate the RPM of the second pulley
double RPM2 = calculatePulleySpeed(diameter1, diameter2, RPM1);
System.out.printf("The RPM of the second pulley is: %.2f\n", RPM2);
// Part 2: Weight Lifted Calculation
System.out.println("\nWeight Lifted Calculation:");
System.out.print("Enter the force exerted (in Newtons): ");
double forceExerted = scanner.nextDouble();
System.out.print("Enter the number of up ropes: ");
int numberOfUpRopes = scanner.nextInt();
// Calculate the weight lifted
double weightLifted = calculateWeightLifted(forceExerted, numberOfUpRopes);
System.out.printf("The weight that can be lifted is: %.2f N\n", weightLifted);
scanner.close();
}
}

