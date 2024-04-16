package lesson04.classwork13;

import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {
        System.out.println("Height calculator. Pls Enter your height in cm");
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        System.out.println("Your height : " + height + " cm");
    }
}
