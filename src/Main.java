import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose task:");
        System.out.println("1. Task1");
        System.out.println("2. Task2");
        System.out.println("3. Task3");
        System.out.println("4. Task4");
        System.out.println("5. Task5");
        System.out.println("6. Task6");
        System.out.println("7. Task7");
        System.out.println("8. Task8");
        System.out.println("9. Task9");
        System.out.println("10. Task10");
        System.out.print("Enter number: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера

        switch (choice) {
            case 1:
                Task1 task1 = new Task1();
                Task1.main(new String[0]);
                break;
            case 2:
                Task2 task2 = new Task2();
                Task2.main(new String[0]);
                break;
            case 3:
                Task3 task3 = new Task3();
                Task3.main(new String[0]);
                break;
            case 4:
                Task4 task4 = new Task4();
                Task4.main(new String[0]);
                break;
            case 5:
                Task5 task5 = new Task5();
                Task5.main(new String[0]);
                break;
            case 6:
                Task6 task6 = new Task6();
                Task6.main(new String[0]);
                break;
            case 7:
                Task7 task7 = new Task7();
                Task7.main(new String[0]);
                break;
            case 8:
                Task8 task8 = new Task8();
                Task8.main(new String[0]);
                break;
            case 9:
                Task9 task9 = new Task9();
                Task9.main(new String[0]);
                break;
            case 10:
                Task10 task10 = new Task10();
                Task10.main(new String[0]);
                break;
            default:
                System.out.println("Incorrect choice.");
                break;
        }

        scanner.close();
    }
}





