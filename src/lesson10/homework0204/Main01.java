package lesson10.homework0204;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arraySize = scanner.nextInt() * 2;
        int[] array = new int[arraySize];

        for (int i = 1; i < arraySize; i+=2) {
            array[i] = scanner.nextInt() * 2;
            array[i-1] = array[i];

        }
        for (int i = 0; i < arraySize; i++) {
            System.out.print(array[i] + " ");

        }
    }
}
