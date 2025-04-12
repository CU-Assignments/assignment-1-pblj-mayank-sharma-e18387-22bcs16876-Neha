// Problem 2: Matrix Operations (Medium Level)
// **Description:**
// Write a Java program to perform **addition, subtraction, and multiplication**
// on two matrices. The program should:
// - Check the dimensions of the matrices to ensure valid operations.

// **Example Input:**
// ```
// Matrix 1:
// 1 2
// 3 4

// Matrix 2:
// 5 6
// 7 8
// ```
// **Example Output:**
// ```
// Addition:
// 6 8
// 10 12

// Subtraction:
// -4 -4
// -4 -4

// Multiplication:
// 19 22
// 43 50

import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows and columns (for both matrices):");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];

        System.out.println("Enter elements of Matrix 1:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix1[i][j] = sc.nextInt();

        System.out.println("Enter elements of Matrix 2:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix2[i][j] = sc.nextInt();

        // Addition
        System.out.println("Addition:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                System.out.print((matrix1[i][j] + matrix2[i][j]) + " ");
            System.out.println();
        }

        // Subtraction
        System.out.println("Subtraction:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                System.out.print((matrix1[i][j] - matrix2[i][j]) + " ");
            System.out.println();
        }

        // Multiplication
        System.out.println("Multiplication:");
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                for (int k = 0; k < cols; k++)
                    result[i][j] += matrix1[i][k] * matrix2[k][j];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                System.out.print(result[i][j] + " ");
            System.out.println();
        }
    }
}
