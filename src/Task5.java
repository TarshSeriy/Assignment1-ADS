import java.util.Scanner;
public class Task5 {
    public static int fibonacci(int n){
        if (n <= 1){
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
