import java.util.Scanner;
import java.util.InputMismatchException;

public class PalindromeChecker {
    
    public static boolean isPalindrome(int number) {
        if (number < 0) {
            return false;
        }
        
        int original = number;
        int reversed = 0;
        
        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;
        }
        
        return original == reversed;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        boolean validInput = false;
        
        // Keep asking until user enters a valid integer
        while (!validInput) {
            System.out.print("Enter an integer: ");
            try {
                input = scanner.nextInt();
                validInput = true;  // Success, exit loop
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid integer (e.g., -123 or 121).");
                scanner.nextLine(); // Clear the bad input buffer
            }
        }
        
        boolean result = isPalindrome(input);
        System.out.println(result);
        
        scanner.close();
    }
}