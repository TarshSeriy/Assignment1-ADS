import java.util.Scanner;
public class Task5 {
    /**
     * This method calculates the Fibonacci number at the given position
     * Time complexity: O(2^n), where n is the position in the Fibonacci sequence.
     * The method uses a binary recursion, which results in an exponential number of calls.
     * @param n The position in fibonacci sequence
     * @return The number in the fibonacci sequence
     */
    public static int fibonacci(int n){
        if (n <= 1){//base case
            return n;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number");
        int number = scanner.nextInt();
        int fib = fibonacci(number);
        System.out.println(fib);
        scanner.close();
    }
}
