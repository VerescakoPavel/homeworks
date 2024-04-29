package lesson08.homework;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pls enter number: ");

        int N = scanner.nextInt();
        int sumEven = 0;

        for (int i = 1; i <= N; i++) {
            if (i % 2 ==0) {
                sumEven += i;
            }
        }
        System.out.println("Sum of even numbers until "+ N + " = " + sumEven);
    }
}
