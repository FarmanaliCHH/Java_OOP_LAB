/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.time;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Time {
private int year;
private int month;
private int day;
private int hour;
private int minute;
private int second;
// Default constructor
public Time() {
LocalDateTime now = LocalDateTime.now();
this.year = now.getYear();
this.month = now.getMonthValue();
this.day = now.getDayOfMonth();
this.hour = now.getHour();
this.minute = now.getMinute();
this.second = now.getSecond();}
// Overloaded constructor (YEAR, MONTH, DAY)
public Time(int year, int month, int day) {
this.year = year;
this.month = month;
this.day = day;
this.hour = 0; // default value
this.minute = 0; // default value
this.second = 0;} // default value
// Overloaded constructor (YEAR, MONTH, DAY, HOUR, MINUTES, SECONDS)
public Time(int year, int month, int day, int hour, int minute, int second) {
this.year = year;
this.month = month;
this.day = day;
this.hour = hour;
this.minute = minute;
this.second = second;}
// Getter methods
public int getYear() {
return year;}
public int getMonth() {
return month;}
public int getDay() {
return day;}
public int getHour() {
return hour;}
public int getMinute() {
return minute;}
public int getSecond() {
return second;}
// Setter methods
public void setYear(int year) {
this.year = year;}
public void setMonth(int month) {
this.month = month;}
public void setDay(int day) {
this.day = day;}
public void setHour(int hour) {
this.hour = hour;}
public void setMinute(int minute) {
this.minute = minute;}
public void setSecond(int second) {
this.second = second;}
// Method to display the current date and time
public String getCurrentDateTime() {
return String.format("%04d-%02d-%02d %02d:%02d:%02d",
year, month, day, hour, minute, second);}
// Main method to test the program
public static void main(String[] args) {
// Default constructor
Time defaultDateTime = new Time();
System.out.println("Default Date and Time: " + defaultDateTime.getCurrentDateTime());
// Overloaded constructor (YEAR, MONTH, DAY)
Time specificDate = new Time(2024, 10, 20);
System.out.println("Specific Date (YEAR, MONTH, DAY): " + specificDate.getCurrentDateTime());
// Overloaded constructor (YEAR, MONTH, DAY, HOUR, MINUTES, SECONDS)
Time specificDateTime = new Time(2024, 10, 20, 15, 30, 45);
System.out.println("Specific Date and Time (YEAR, MONTH, DAY, HOUR, MINUTES, SECONDS): " +
specificDateTime.getCurrentDateTime());}}


