package lesson06.homework1903;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Здравствуйте, Вас приветствует быстрый квиз.\n" +
                "Правильный ответ может быть только 1");
        System.out.println();

        System.out.println("В языке Java у каждой переменной есть:\n" +
                "1.имя\n" +
                "2.имя и тип\n" +
                "3.имя,тип и значение\n" +
                "4.имя и значение");
        System.out.println();
        System.out.print("Ваш ответ (только число): ");
        int answer = scanner.nextInt();
        int score = 0;
        if (answer == 3 ) {
            score++;
        }

        System.out.println();
        System.out.println("Какие примитивные типы данных есть в Java?\n" +
                "\n" +
                "1) int, float, char, double\n" +
                "2) byte, short, int, long, float, double, char, boolean\n" +
                "3) string, integer, double, boolean\n" +
                "4) int, short, long, byte, float, double, char, string");
        System.out.println();
        System.out.print("Ваш ответ (только число): ");
        answer = scanner.nextInt();
        if (answer == 2 ) {
            score++;
        }

        System.out.println();
        System.out.println("Как объявить переменную типа \"целое число\" (integer) в Java?\n" +
                "\n" +
                "1) String num = 10;\n" +
                "2) int num = 10;\n" +
                "3) Integer num = 10;\n" +
                "4) integer num = 10;");
        System.out.println();
        System.out.print("Ваш ответ (только число): ");
        answer = scanner.nextInt();
        if (answer == 2 ) {
            score++;
        } System.out.println();

        System.out.println("Что из перечисленного используется для хранения одного символа в Java?\n" +
                "\n" +
                "1) char\n" +
                "2) string\n" +
                "3) character\n" +
                "4) chr");
        System.out.println();
        System.out.print("Ваш ответ (только число): ");
        answer = scanner.nextInt();
        if (answer == 1 ) {
            score++;
        }System.out.println();

        System.out.println("Какой из нижеперечисленных типов данных используется для хранения маленьких (наименьший) целых чисел в Java?\n" +
                "\n" +
                "1)int\n" +
                "2)short\n" +
                "3)long\n" +
                "4)byte");
        System.out.println();
        System.out.print("Ваш ответ (только число): ");
        answer = scanner.nextInt();

        if (answer == 4 ) {
            score++;
        }
        System.out.println("Ваш результат : " + score);
        System.out.print(score >= 3 ? "Вы справились с тестом" : "Вы провалились");
    }
}