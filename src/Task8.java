import java.util.Scanner;
public class Task8 {
    public static boolean checkDigits(String s){
        return !s.isEmpty() && s.matches("\\d+");
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string");
        String input = scanner.nextLine();

        if (checkDigits(input)){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
        scanner.close();
    }
}
