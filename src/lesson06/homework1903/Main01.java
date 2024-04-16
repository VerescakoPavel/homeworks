package lesson06.homework1903;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ваш вес в (кг) :");
        int weight = scanner.nextInt();

        System.out.print("Ваш рост в (см) :");
        float height = scanner.nextInt() / 100f;

        float BMI =  weight / (height * height);
        System.out.println("You BMI : " + BMI);
        if (BMI < 0) {
            System.out.println("Что-то не так. Попробуйте снова.");
            } else if (BMI < 15) {
            System.out.println("У Вас анорексия.");
        } else if (BMI < 20) {
            System.out.println("У Вас недостаточный вес.");
        } else if (BMI < 25) {
            System.out.println("У Вас нормальный вес.");
        } else if (BMI < 30) {
            System.out.println("У Вас лишний вес.");
        } else System.out.println("У Вас ожирениее.");


    }
}
