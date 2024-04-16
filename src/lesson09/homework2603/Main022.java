package lesson09.homework2603;

import java.util.Scanner;

public class Main022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = scanner.nextInt();
        int step = scanner.nextInt();
        int element = scanner.nextInt();

        double result = (double) step * element / 2 * (element - 1) + firstNum * element;

        System.out.println((int) result);
    }
}
