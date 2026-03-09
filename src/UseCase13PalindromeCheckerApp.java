import java.util.*;

public class
git checkout --orphan uc13-performance-palindrome{

    // Stack-based method
    public static boolean stackPalindrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) stack.push(ch);
        for (char ch : str.toCharArray()) if (ch != stack.pop()) return false;
        return true;
    }

    // Deque-based method
    public static boolean dequePalindrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();
        Deque<Character> deque = new ArrayDeque<>();
        for (char ch : str.toCharArray()) deque.addLast(ch);
        while (deque.size() > 1) if (deque.removeFirst() != deque.removeLast()) return false;
        return true;
    }

    // Recursive method
    public static boolean recursivePalindrome(String str, int start, int end) {
        if (start >= end) return true;
        if (str.charAt(start) != str.charAt(end)) return false;
        return recursivePalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string to check palindrome:");
        String input = sc.nextLine();
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Stack
        long startTime = System.nanoTime();
        boolean stackResult = stackPalindrome(input);
        long endTime = System.nanoTime();
        long stackTime = endTime - startTime;

        // Deque
        startTime = System.nanoTime();
        boolean dequeResult = dequePalindrome(input);
        endTime = System.nanoTime();
        long dequeTime = endTime - startTime;

        // Recursive
        startTime = System.nanoTime();
        boolean recursiveResult = recursivePalindrome(normalized, 0, normalized.length() - 1);
        endTime = System.nanoTime();
        long recursiveTime = endTime - startTime;

        // Display results
        System.out.println("\nResults:");
        System.out.printf("Stack: %s | Time: %d ns\n", stackResult ? "Palindrome" : "Not Palindrome", stackTime);
        System.out.printf("Deque: %s | Time: %d ns\n", dequeResult ? "Palindrome" : "Not Palindrome", dequeTime);
        System.out.printf("Recursive: %s | Time: %d ns\n", recursiveResult ? "Palindrome" : "Not Palindrome", recursiveTime);

        sc.close();
    }
}