package homework.lesson25.task2;

import java.util.Scanner;

/*
1. Пользователь вводит два числа - начальное и конечное число.
2. Выведите на экран все числа в этом промежутке, НО решите задание обязательно через реккурсию
 */
public class Main {

    public static void numbersBetween(int first, int last) {
        System.out.print(first + " ");
        if (first == last) {
            return;
        }

        if (first < last) {
            numbersBetween(first + 1, last);
        } else {
            numbersBetween(first - 1, last);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int lastNumber = scanner.nextInt();

        numbersBetween(firstNumber, lastNumber);
    }

}