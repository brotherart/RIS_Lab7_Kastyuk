import java.util.Scanner;

public class FibonacciNumbers implements SpringFibonacci {
    @Override
    public int[] showFibonacci(int count) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[count];
        int n1, n2;
        while (true) {
            try {
                System.out.println("Введите первых два числа.");
                System.out.print(" первое: ");
                n1 = scanner.nextInt();
                arr[0] = n1;
                System.out.print(" второе: ");
                n2 = scanner.nextInt();
                arr[1] = n2;
                break;
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод!");
            }
        }

        for (int i = 2; i < arr.length; ++i) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr;
    }
}
