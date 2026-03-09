import java.util.Scanner;

public class UseCase9PalindromeCheckerApp {

    // Recursive method to check palindrome
    private static boolean isPalindrome(String str, int start, int end) {
        // Base case: crossed over or one character left
        if (start >= end) {
            return true;
        }
        // If characters do not match
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        // Recursive call
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string to check palindrome:");
        String input = sc.nextLine().replaceAll("\\s+", "").toLowerCase();

        if (isPalindrome(input, 0, input.length() - 1)) {
            System.out.println("The given string is a Palindrome.");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }

        sc.close();
    }
}