//  Problem 1: String Analysis (Easy Level)
// **Description:**  
// Write a Java program to analyze a user-input string. The program should:
// - Count the number of **vowels, consonants, digits, and special characters**.

// **Example Input:**

// Enter a string: Hello World 2024!

// **Example Output:**

// Vowels: 3
// Consonants: 7
// Digits: 4
// Special Characters: 3

import java.util.Scanner;

public class StringAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int vowels = 0, consonants = 0, digits = 0, specialChars = 0;

        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                char lower = Character.toLowerCase(ch);
                if ("aeiou".indexOf(lower) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (Character.isDigit(ch)) {
                digits++;
            } else if (!Character.isWhitespace(ch)) {
                specialChars++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Special Characters: " + specialChars);
    }
}
