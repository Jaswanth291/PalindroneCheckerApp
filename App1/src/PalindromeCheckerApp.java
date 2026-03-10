import java.util.LinkedList;
import java.util.Scanner;

public class PalindromeCheckerApp {

    public static boolean isPalindrome(String input) {

        LinkedList<Character> list = new LinkedList<>();

        // Add characters to LinkedList
        for (char ch : input.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                list.add(Character.toLowerCase(ch));
            }
        }

        // Compare first and last elements
        while (list.size() > 1) {
            if (!list.removeFirst().equals(list.removeLast())) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (isPalindrome(input)) {
            System.out.println("The string is a Palindrome");
        } else {
            System.out.println("The string is NOT a Palindrome");
        }

        sc.close();
    }
}