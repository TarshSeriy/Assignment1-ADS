import java.util.Scanner;
public class Task4 {
    /**
     * This method returns the factorial of the given number
     * Time complexity: O(n), where n is the input number.
     * Using recursion, the method multiplies all numbers from n to 1 by calling itself with the parameter n - 1.
     * @param n The number for finding factorial
     * @return factorial of the given number
     */
    public static int findFactorial(int n){
       if(n == 1) {//Base case
           return 1;

       }
       return n * findFactorial(n-1);


    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number");
        int number = scanner.nextInt();
        int fact = findFactorial(number);
        System.out.println(fact);
        scanner.close();


    }
}
