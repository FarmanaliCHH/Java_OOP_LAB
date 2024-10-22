/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculator;
import java.util.Scanner;
public class Calculator {
    public void SDPCalculator(int x, int y){
        int sum=x+y;
        System.out.println(x + " + " + y + " = " + sum);
        int difference=x-y;
        System.out.println(x + " - " + y + " = " + difference);
        int product=x*y;
        System.out.println(x + " x " + y + " = " + product);   
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("input the value of x:");
        int x=s.nextInt();
        System.out.println("input the value of y:");   
        int y=s.nextInt();  
        Calculator answer=new Calculator();
        answer.SDPCalculator(x, y);
    }
}
