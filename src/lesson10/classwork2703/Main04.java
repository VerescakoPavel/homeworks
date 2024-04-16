package lesson10.classwork2703;

import java.util.Random;
import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        Random random = new Random();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt(21) - 10;
            System.out.print(numbers[i]);
            if (numbers[i] < 0) {
                numbers[i] = 0;
                System.out.println(numbers[i]);
            }
        }
    }
}
