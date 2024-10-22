/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hospitalreceptionist;
import java.util.Scanner;

public class HospitalReceptionist {
    // Global variables to store patient information
    String pNumber;
    String pName;
    int pAge;
    String pEmail;
    String pContact;
    String pComplain;
    double pBill;

    // Method to take patient data
    public void Take_Patient_data() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Patient Number: ");
        pNumber = scanner.nextLine();
        
        System.out.print("Enter Patient Name: ");
        pName = scanner.nextLine();
        
        System.out.print("Enter Patient Age: ");
        pAge = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        System.out.print("Enter Patient Email: ");
        pEmail = scanner.nextLine();
        
        System.out.print("Enter Patient Contact: ");
        pContact = scanner.nextLine();
        
        System.out.print("Enter Patient Complaint: ");
        pComplain = scanner.nextLine();
        
        System.out.print("Enter Bill Amount: ");
        pBill = scanner.nextDouble();
        
        // Call the method to print the receipt
        Print_Receipt();
    }

    // Method to print the receipt
    public void Print_Receipt() {
        System.out.println("\n--- Patient Receipt ---");
        System.out.println("Patient Number: " + pNumber);
        System.out.println("Patient Name: " + pName);
        System.out.println("Patient Age: " + pAge);
        System.out.println("Patient Email: " + pEmail);
        System.out.println("Patient Contact: " + pContact);
        System.out.println("Patient Complaint: " + pComplain);
        System.out.println("Bill Amount: $" + pBill);
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        HospitalReceptionist receptionist = new HospitalReceptionist();
        receptionist.Take_Patient_data(); // Start the process
    }
}

