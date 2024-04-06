import java.util.Scanner;
public class Task2 {
    public static double calculateAverage(int[] arr){
        if (arr.length == 0){
            throw new IllegalArgumentException("Array is empty");
        }
        int sum = 0;
        for(int num: arr){
            sum += num;
        }
        return (double) sum / arr.length;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give size of array");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Give the elements of the array");
        for(int i = 0;  i < n; i++){
            array[i] = scanner.nextInt();
        }
        double average = calculateAverage(array);
        System.out.println(average);
    }
}
