/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matrixtest;
import java.util.Scanner;
public class MatrixTest {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
// Initialize matrices
double[][] Mat_1 = new double[3][3];
double[][] Mat_2 = new double[3][3];
// Input for Mat_1
System.out.println("Enter values for Mat_1 (3x3 matrix):");
for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {
System.out.printf("Mat_1[%d][%d]: ", i, j);
Mat_1[i][j] = scanner.nextDouble();}}
// Input for Mat_2
System.out.println("Enter values for Mat_2 (3x3 matrix):");
for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {
System.out.printf("Mat_2[%d][%d]: ", i, j);
Mat_2[i][j] = scanner.nextDouble();}}
// Calculate (Mat_1^3) + (Mat_2^2)
double[][] Mat_1_Cubed = matrixPower(Mat_1, 3);
double[][] Mat_2_Squared = matrixPower(Mat_2, 2);
double[][] result1 = addMatrices(Mat_1_Cubed, Mat_2_Squared);
System.out.println("Result of (Mat_1^3) + (Mat_2^2):");
printMatrix(result1);
// Calculate (Mat_2 - 3)^2
double[][] Mat_2_Subtracted = subtractFromMatrix(Mat_2, 3);
double[][] result2 = matrixPower(Mat_2_Subtracted, 2);
System.out.println("Result of (Mat_2 - 3)^2:");
printMatrix(result2);
// Calculate (Mat_2^5) - (Mat_1 - 2)
double[][] Mat_2_Fifth = matrixPower(Mat_2, 5);
double[][] Mat_1_Subtracted = subtractFromMatrix(Mat_1, 2);
double[][] result3 = subtractMatrices(Mat_2_Fifth, Mat_1_Subtracted);
System.out.println("Result of (Mat_2^5) - (Mat_1 - 2):");
printMatrix(result3);
scanner.close();}
// Function to raise a matrix to a power
private static double[][] matrixPower(double[][] matrix, int power) {
double[][] result = matrix;
for (int i = 1; i < power; i++) {
result = multiplyMatrices(result, matrix);}
return result;}
// Function to multiply two matrices
private static double[][] multiplyMatrices(double[][] matrixA, double[][] matrixB) {
double[][] result = new double[3][3];
for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {
result[i][j] = 0;
for (int k = 0; k < 3; k++) {
result[i][j] += matrixA[i][k] * matrixB[k][j];}}}
return result;}
// Function to add two matrices
private static double[][] addMatrices(double[][] matrixA, double[][] matrixB) {
double[][] result = new double[3][3];
for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {
result[i][j] = matrixA[i][j] + matrixB[i][j];}}
return result;}
// Function to subtract a scalar from a matrix
private static double[][] subtractFromMatrix(double[][] matrix, double scalar) {
double[][] result = new double[3][3];
for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {
result[i][j] = matrix[i][j] - scalar;}}
return result;}
// Function to subtract two matrices
private static double[][] subtractMatrices(double[][] matrixA, double[][] matrixB) {
double[][] result = new double[3][3];
for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {
result[i][j] = matrixA[i][j] - matrixB[i][j];}}
return result;}
// Function to print a matrix
private static void printMatrix(double[][] matrix) {
for (double[] row : matrix) {
for (double value : row) {
System.out.printf("%.2f ", value);}
System.out.println();}}}


