import java.util.Scanner;
public class Task6 {
    /**
     * This method calculates the power of the n in the degree b
     * Time complexity: O(n), where n is the exponent to which the number is raised.
     * The method makes a number of recursive calls equal to the degree, resulting in linear time complexity.
     * @param n A number that is raised to a power
     * @param b The number to which the first number is raised
     * @return The result of raising the first number to the given power
     */
    public static int findDegree(int n, int b){
        if (b == 0){//base case
            return 1;
        }
        return n * pow(n, b-1);
    }
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number");
        int number1 = scanner.nextInt();

        System.out.print("Enter second number");
        int number2 = scanner.nextInt();

        int degree = findDegree(number1 , number2);
        System.out.println(degree);
        scanner.close();
    }
}

