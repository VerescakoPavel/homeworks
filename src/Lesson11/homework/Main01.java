package Lesson11.homework;


import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] currencyName = {"Eur", "USD", "TL"};
        double[] currencyRate = {1.08, 1.0, 0.031}; // Курсы: EURO, USD, TL

        while (true) {
            System.out.println("Приветствуем в CurrencyConverter!");
            System.out.println("Выберите исходную валюту:");
            System.out.println("1. EURO");
            System.out.println("2. USD");
            System.out.println("3. TL");
            System.out.println("0. Выход");
            System.out.println();
            System.out.print("Ваш выбор (только цифру): ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Вы выбрали выход");
                break;
            }

            if (choice < 1 || choice > 3) {
                System.out.println("Неверный выбор. Пожалуйста, выберите снова.");
                continue;
            }


            System.out.print("Введите сумму в исходной валюте: ");
            double amount = scanner.nextDouble();

            System.out.println("Выберите валюту, в которую нужно перевести:");
            System.out.println("1. EURO");
            System.out.println("2. USD");
            System.out.println("3. TL");
            System.out.println();
            System.out.print("Ваш выбор (только цифру): ");
            int targetCurrency = scanner.nextInt();

            if (targetCurrency < 1 || targetCurrency > 3) {
                System.out.println("Неверный выбор валюты. Пожалуйста, выберите снова.");
                continue;
            }
            double result = amount * currencyRate[choice - 1] / currencyRate[targetCurrency - 1];

            System.out.println(amount + currencyName[choice - 1] + " -> " + result + currencyName[targetCurrency - 1]);
            System.out.println();

        }

    }


}