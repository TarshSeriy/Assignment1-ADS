import java.util.Scanner;

public class Task7 {
    /**
     * This method reads a sequence of integers from standard input and prints them in reverse order.
     * Time complexity: O(n), where n is the number of integers to read. Each recursive call processes one number.
     * @param arr
     * @param start
     * @param end
     */
    public static void reverse(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverse(arr, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give size of the array:");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Give elements:");
        for (int i = 0; i < size; i++) {
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

