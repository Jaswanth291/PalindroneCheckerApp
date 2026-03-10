import java.util.Scanner;

// Service class (contains palindrome logic)
class PalindromeService {

    public boolean isPalindrome(String input) {

        // Remove spaces and convert to lowercase
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

// Main class
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PalindromeService service = new PalindromeService();

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (service.isPalindrome(input)) {
            System.out.println("The string is a Palindrome");
        } else {
            System.out.println("The string is NOT a Palindrome");
        }

        sc.close();
    }
}