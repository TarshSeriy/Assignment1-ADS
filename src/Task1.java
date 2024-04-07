import java.util.Scanner;

/**
 * This class finds the minimum values from an array of numbers
 * The findMinimum method iterates through the array to determine the smallest element.
 */
public class Task1 {
    /**
     * This method finds the minimum value in the given array of the integers
     * @param array of integers where we need to find the minimum value
     * @return The smallest integer of the array
     */
    public static int findMinimum(int[] arr){
        if (arr.length == 0){
            throw new IllegalArgumentException("Array is empty");

        }
        int minElement = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] < minElement) {
                minElement = arr[i];
            }
        }
        return minElement;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give size of array");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Give the elements of the array");
        for(int i = 0;  i < size; i++){
            array[i] = scanner.nextInt();
        }
        int min = findMinimum(array);
        System.out.println(min);
        scanner.close();
    }
}
