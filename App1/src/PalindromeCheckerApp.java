import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Convert string to character array
        char[] arr = input.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        boolean isPalindrome = true;

        // Compare characters
        while (left < right) {

            if (arr[left] != arr[right]) {
                isPalindrome = false;
                break;
            }

            left++;
            right--;
        }

        // Result
        if (isPalindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");

        sc.close();
    }
}