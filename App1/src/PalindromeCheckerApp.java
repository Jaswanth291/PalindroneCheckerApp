import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare with popped characters
        for (int i = 0; i < input.length(); i++) {

            char ch = stack.pop();

            if (input.charAt(i) != ch) {
                isPalindrome = false;
                break;
            }
        }

        // Result
        if (isPalindrome)
            System.out.println("1Palindrome");
        else
            System.out.println("Not a Palindrome");

        sc.close();
    }
}