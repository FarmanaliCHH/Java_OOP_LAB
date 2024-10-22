/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.equationcalculator;
import java.util.Scanner;

public class EquationCalculator {
    
    public static void Equation1(){
        Scanner s=new Scanner(System.in);
        System.out.println("input the value of x:");
        int x=s.nextInt();
        System.out.println("input the value of y:");
        int y=s.nextInt();
        int answer=2*x*x+y*y;
        System.out.println("2x2 + y2 = " + answer);}
    
        public static void Equation2(){
        Scanner s=new Scanner(System.in);
        System.out.println("input the value of x:");
        int x=s.nextInt();
        System.out.println("input the value of y:");
        int y=s.nextInt();
        System.out.println("input the value of z:");
        int z=s.nextInt();
        int answer=3*x+y-3*z*z;
        System.out.println("3x + y -3z2 = " + answer);
        }
        
        public static void Equation3(){
        Scanner s=new Scanner(System.in);
        System.out.println("input the value of x:");
        int x=s.nextInt();
        System.out.println("input the value of y:");
        int y=s.nextInt();
        System.out.println("input the value of z:");
        int z=s.nextInt();
        int answer=2*x-2*y+5*z*z;
        System.out.println("2x -2y + 5z2 = " + answer);
        }

        

    public static void main(String[] args) {
      System.out.println("find the value of the equation:\n 1) 2x^2+y^2\n 2) 3x+y-z^2\n 3) 2x-2y+5z^2");
      Scanner s=new Scanner(System.in);
      int choice=s.nextInt();
      switch (choice){
          case 1: Equation1();
          break;
          case 2: Equation2();
          break;
          case 3: Equation3();
          break;
      }}}
       
       
    

