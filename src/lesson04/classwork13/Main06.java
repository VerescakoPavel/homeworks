package lesson04.classwork13;

import java.util.Scanner;

public class Main06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pls Enter A and B");
        System.out.print("A: ");
        int a = scanner.nextInt();
        System.out.print("B: ");
        int b = scanner.nextInt();

        int res = a + b;

        System.out.println(a + " + " + b + " = " + res);
    }
}
