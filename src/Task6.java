import java.util.Scanner;
public class Task6 {
    public static int findDegree(int n, int b){
        int result = 1;
        for(int i = 1; i <= b; i++){
            result   *= n;
        }
        return result;
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

