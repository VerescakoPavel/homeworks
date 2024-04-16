package lesson8.classwork;

import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int score = 0;
        double result = 0;
        int input = 1;

        while (input != 0) {
            input = scanner.nextInt();
            sum = sum + input;
            score++;
        }
        result = (double) sum / (score - 1);
        System.out.println(result);

    }
}
