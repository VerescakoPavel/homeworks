package lesson08.classwork;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        int result = 1;
        for (int i = 1; i <= input; i++) {
            result = result * i;


        }
        System.out.println(result);
    }

}
