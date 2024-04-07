import java.util.Scanner;
public class Task10{
    /**
     *  This method calculates the greatest common divisor (GCD) of two integers using the Euclidean algorithm.
     *  Time complexity: O(log(min(a, b))), where a and b are the input integers.
     * @param a The first integer for finding GCD
     * @param b The second integer for finding GCD
     * @return The GCD of a and b
     */
    public static int findGcd(int a, int b){
        if (a < b){
            int x = a;
            a = b;
            b = x;
        }
        if(a % b == 0){
            return b;
        }
        return findGcd(b, a % b);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers a and b: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int gcd  = findGcd(a,b);
        System.out.println(gcd);
        scanner.close();
    }
}
