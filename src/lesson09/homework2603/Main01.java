package lesson09.homework2603;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     
        int num = 0;
        int score = 0;

        while (num < 1) {
            System.out.println("Введите натуральное число: ");
            num = scanner.nextInt();
            score++;
            }
        System.out.println("Вы ввели " + num + ". У вас получилось это сделать с " + score + " попытки. Спасибо!");
        }
    }

