/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.book;
// Book.java
public class Book {
// Instance variables
private String title;
private String author;
private double price;
// Constructor
public Book(String title, String author, double price) {
this.title = title;
this.author = author;
this.price = price;}
// Instance methods
public void setTitle(String title) {
this.title = title;}
public void setAuthor(String author) {
this.author = author;}
public void setPrice(double price) {
this.price = price;}
public String getTitle() {
return title;}
public String getAuthor() {
return author;}
@Override
public String toString() {
return "Book Title: " + title + ", Author: " + author + ", Price: $" + price;
}
}
package com.mycompany.book;
// BookDemo.java
public class BookDemo {
public static void main(String[] args) {
// Creating a Book object
Book book = new Book("Developing Java Software", "Russel Winder", 79.75);
// Printing the Book's string representation
System.out.println(book);}}


