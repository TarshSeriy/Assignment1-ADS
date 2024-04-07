import java.util.Scanner;

public class Task8 {
    /**
     * This method checks if all characters in a string are digits using recursion.
     * @param s The string to check for digit-only characters.
     * @param firstChar The first char in the string
     * @return True if all characters are digits, false if not
     */
    public static boolean checkDigits(String s) {
        // Base case: if the string is empty, it is valid
        if (s.isEmpty()) {
            return true;
        }
        char firstChar = s.charAt(0);
        if (Character.isDigit(firstChar)) {
            return checkDigits(s.substring(1));
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = scanner.nextLine();

        if (checkDigits(input)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        scanner.close();
    }
}

