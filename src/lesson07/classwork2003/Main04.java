package lesson07.classwork2003;

import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if ((a + b > c) && (b + c > a) && (a + c > b)) {
            System.out.println("Triangle can be");
        } else
            System.out.println("Cannot be");
    }
}
