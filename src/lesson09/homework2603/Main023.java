package lesson09.homework2603;

import java.util.Scanner;

public class Main023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = scanner.nextInt();
        int step = scanner.nextInt();
        int element = scanner.nextInt();

        int[] array = new int[element];
        int sum = firstNum;
        array[0] = firstNum;

        for (int i = 1; i < element; i++) {
            array[i] = array[i-1] + step;
            sum += array[i];
        }
        System.out.println(sum);
    }
}
