import java.util.Scanner;

public class UseCase10PalindromeCheckerApp {

    // Method to check palindrome
    private static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string to check palindrome:");
        String input = sc.nextLine();

        // Normalize string: remove spaces and convert to lowercase
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        if (isPalindrome(normalized)) {
            System.out.println("The given string is a Palindrome (case-insensitive & space-ignored).");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }

        sc.close();
    }
}