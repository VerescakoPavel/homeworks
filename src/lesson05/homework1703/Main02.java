package lesson05.homework1703;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите свой возраст : ");
        int age = scanner.nextInt();
        if (age < 0) {
            System.out.println("Wrong number");
        } else if (age >= 60) {
                System.out.println("Вы пожилой человек");
            } else if (age >= 27) {
                System.out.println("Вы молодой человек");
            } else if (age >= 12) {
                System.out.println("Вы подросток");
            } else if (age < 12) {
                System.out.println("Вы ребёнок");
            }
        }

}