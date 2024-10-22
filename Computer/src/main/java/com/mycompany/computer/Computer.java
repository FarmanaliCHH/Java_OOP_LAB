/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.computer;
import java.util.Scanner;
import java.util.Scanner;
class Computer {
// Attributes of the Computer class
private String name;
private String type;
private String processor;
private int ram; // in GB
private int hardDisk; // in GB
private String motherboard;
private String opticalDrive;
// Default constructor
public Computer() {
// Initializing with default values
this.name = "Unknown";
this.type = "Unknown";
this.processor = "Unknown";
this.ram = 0;
this.hardDisk = 0;
this.motherboard = "Unknown";
this.opticalDrive = "None";}
// Method to get input from the user
public void getInput() {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter Computer Name: ");
name = scanner.nextLine();
System.out.print("Enter Computer Type: ");
type = scanner.nextLine();
System.out.print("Enter Processor Specification: ");
processor = scanner.nextLine();
System.out.print("Enter RAM (in GB): ");
ram = scanner.nextInt();
System.out.print("Enter Hard Disk Size (in GB): ");
hardDisk = scanner.nextInt();
scanner.nextLine(); // Consume newline
System.out.print("Enter Motherboard: ");
motherboard = scanner.nextLine();
System.out.print("Enter Optical Drive (e.g., DVD, Blu-ray): ");
opticalDrive = scanner.nextLine();}
// Method to display the computer information
public void displayInfo() {
System.out.println("\nComputer Specifications:");
System.out.println("Name: " + name);
System.out.println("Type: " + type);
System.out.println("Processor: " + processor);
System.out.println("RAM: " + ram + " GB");
System.out.println("Hard Disk: " + hardDisk + " GB");
System.out.println("Motherboard: " + motherboard);
System.out.println("Optical Drive: " + opticalDrive);}
// Method to allow the user to change information
public void changeInfo() {
Scanner scanner = new Scanner(System.in);
System.out.print("Do you want to change any information? (yes/no): ");
String choice = scanner.nextLine();
if (choice.equalsIgnoreCase("yes")) {
System.out.print("Enter the field you want to change (name, type, processor, ram, hardDisk, motherboard, opticalDrive): ");
String field = scanner.nextLine();
switch (field.toLowerCase()) {
case "name":
System.out.print("Enter new Computer Name: ");
name = scanner.nextLine();
break;
case "type":
System.out.print("Enter new Computer Type: ");
type = scanner.nextLine();
break;
case "processor":
System.out.print("Enter new Processor Specification: ");
processor = scanner.nextLine();
break;
case "ram":
System.out.print("Enter new RAM (in GB): ");
ram = scanner.nextInt();
break;
case "harddisk":
System.out.print("Enter new Hard Disk Size (in GB): ");
hardDisk = scanner.nextInt();
break;
case "motherboard":
System.out.print("Enter new Motherboard: ");
motherboard = scanner.nextLine();
break;
case "opticaldrive":
System.out.print("Enter new Optical Drive: ");
opticalDrive = scanner.nextLine();
break;
default:
System.out.println("Invalid field!");
break;}}}
public static void main(String[] args) {
Computer computer = new Computer(); // Create a new Computer object
computer.getInput(); // Get input from the user
computer.displayInfo(); // Display the inputted information
computer.changeInfo(); // Allow the user to change information
computer.displayInfo();}} // Display the updated information

