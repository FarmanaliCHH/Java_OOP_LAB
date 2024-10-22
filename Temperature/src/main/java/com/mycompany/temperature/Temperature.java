/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.temperature;
public class Temperature {
   static double tempCalculator(int c){
        double f=(c*(9.0/5.0))+32;
        return f;
    }

    public static void main(String[]args) {
       System.out.println("289 celcuis in fahrenheit = " + tempCalculator(289));
       System.out.println("400 celcuis in fahrenheit = " + tempCalculator(400));
       System.out.println("-36 celcuis in fahrenheit = " + tempCalculator(-36));
       System.out.println("-180 celcuis in fahrenheit = " + tempCalculator(-180));
    }
}