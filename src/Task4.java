import java.util.Scanner;
public class Task4 {
    public static int findFactorial(int n){
        if(n == 1 || n == 0){
            return 1;
        } if(n == 2){
            return 2;
        }
        else{
            int factorial = 1;
            for(int i = 2; i <= n; i++){
                factorial *= i;
            }
            return factorial;
        }


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
