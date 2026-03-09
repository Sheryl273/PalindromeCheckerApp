import java.util.Scanner;

class PalindromeChecker {
    private String input;

    // Constructor
    public PalindromeChecker(String input) {
        this.input = input.replaceAll("\\s+", "").toLowerCase(); // normalize
    }

    // Method to check palindrome
    public boolean checkPalindrome() {
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

public class UseCase11PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string to check palindrome:");
        String userInput = sc.nextLine();

        // Create PalindromeChecker object
        PalindromeChecker checker = new PalindromeChecker(userInput);

        // Use the object to check
        if (checker.checkPalindrome()) {
            System.out.println("The given string is a Palindrome (OOP style).");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }

        sc.close();
    }
}