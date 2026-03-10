import java.util.Scanner;

public class PalindromeCheckerApp {

    public static boolean isPalindrome(String input) {

        // Remove spaces and special characters, convert to lowercase
        input = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = input.length() - 1;

        // Compare characters from both ends
        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (isPalindrome(input)) {
            System.out.println("The string is a Palindrome (case-insensitive, spaces ignored)");
        } else {
            System.out.println("The string is NOT a Palindrome");
        }

        sc.close();
    }
}