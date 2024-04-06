import java.util.Scanner;
public class Task7 {
    public static void reverse(int[] arr, int start, int end){
        if(start >= end){
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give size of the array");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Give elements");
        for(int i = 0; i < size; i++){
            array[i] = scanner.nextInt();
        }
        reverse(array, 0, size - 1);
        System.out.println("Reversed array:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        scanner.close();
    }
}
