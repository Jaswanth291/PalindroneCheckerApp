import java.util.Scanner;

public class PalindromeCheckerApp {

    // Iterative Method
    public static boolean iterativePalindrome(String input) {
        input = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Recursive Method
    public static boolean recursivePalindrome(String str, int start, int end) {
        if (start >= end) {
            return true;
        }

        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        return recursivePalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String processed = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Measure Iterative Time
        long startTime1 = System.nanoTime();
        boolean iterativeResult = iterativePalindrome(input);
        long endTime1 = System.nanoTime();

        // Measure Recursive Time
        long startTime2 = System.nanoTime();
        boolean recursiveResult = recursivePalindrome(processed, 0, processed.length() - 1);
        long endTime2 = System.nanoTime();

        System.out.println("\nIterative Method Result: " + iterativeResult);
        System.out.println("Iterative Time: " + (endTime1 - startTime1) + " ns");

        System.out.println("\nRecursive Method Result: " + recursiveResult);
        System.out.println("Recursive Time: " + (endTime2 - startTime2) + " ns");

        sc.close();
    }
}