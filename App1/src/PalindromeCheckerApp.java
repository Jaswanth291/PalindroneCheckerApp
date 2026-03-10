import java.util.Scanner;

// Strategy Interface
interface PalindromeStrategy {
    boolean isPalindrome(String input);
}

// Strategy 1: Iterative Method
class IterativePalindrome implements PalindromeStrategy {
    public boolean isPalindrome(String input) {

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
}

// Strategy 2: Recursive Method
class RecursivePalindrome implements PalindromeStrategy {

    public boolean isPalindrome(String input) {
        input = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return check(input, 0, input.length() - 1);
    }

    private boolean check(String str, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        return check(str, start + 1, end - 1);
    }
}

// Context Class
class PalindromeContext {

    private PalindromeStrategy strategy;

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean execute(String input) {
        return strategy.isPalindrome(input);
    }
}

// Main Class
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PalindromeContext context = new PalindromeContext();

        System.out.println("Choose Palindrome Strategy:");
        System.out.println("1. Iterative Method");
        System.out.println("2. Recursive Method");

        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            context.setStrategy(new IterativePalindrome());
        } else {
            context.setStrategy(new RecursivePalindrome());
        }

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (context.execute(input)) {
            System.out.println("The string is a Palindrome");
        } else {
            System.out.println("The string is NOT a Palindrome");
        }

        sc.close();
    }
}