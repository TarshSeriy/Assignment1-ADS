import java.util.Scanner;
public class Task10{
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
