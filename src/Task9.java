import java.util.Scanner;
public class Task9 {
    /**
     * This method calculates the binomial coefficient
     * It uses a recursive approach based on the recurrence relation C(n, k) = C(n-1, k-1) + C(n-1, k).
     * @param n The total number of items
     * @param k The number of items to choose
     * @return The binomial coefficient
     */
    public static int binomialCoefficient(int n, int k){
        if(k == 0 || k == n){
            return 1;
        }

        return binomialCoefficient(n-1, k-1) + binomialCoefficient(n-1, k);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers n and k: ");
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int bin = binomialCoefficient(n,k);
        System.out.println(bin);
        scanner.close();

    }
}
