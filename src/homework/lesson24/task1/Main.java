package homework.lesson24.task1;

import java.util.Scanner;

/*
1. Пользователь вводит строку через консоль, разделить строку на слова, а также:
1. Из каждого слова возьмите первую букву и составьте из них строку, в которой содержались бы все первые буквы слов
2. Напишите на экран размер получившейся строки, а также первую и последнюю буквы слова

 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] input = str.split(" ");
        String firstLetters = "";
        for (int i = 0; i < input.length; i++) {
            if (input[i].length() > 0) { // проверяем не пустая ли строка. Исключаем ошибку если пользователь ввел больше одного пробела между слов.
                firstLetters += input[i].substring(0, 1);
            }
        }
        System.out.println(firstLetters);
        System.out.println("String length = " + firstLetters.length());
        System.out.println("First letter = " + firstLetters.charAt(0));
        System.out.println("Last letter = " + firstLetters.charAt(firstLetters.length() - 1));
    }
}
