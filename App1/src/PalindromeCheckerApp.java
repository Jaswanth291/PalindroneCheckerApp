import java.util.Scanner;
public class PalindromeCheckerApp{
    public static void main(String[] args){



                Scanner sc = new Scanner(System.in);
                System.out.print("Enter a word: ");
                String str = sc.nextLine();

                String rev = "";

                // reverse string
                for (int i = str.length() - 1; i >= 0; i--) {
                    rev = rev + str.charAt(i);
                }

                // check palindrome
                if (str.equals(rev)) {
                    System.out.println("Palindrome");
                } else {
                    System.out.println("Not Palindrome");
                }
    }
}