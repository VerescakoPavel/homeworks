package homework.lesson29.task2;

import java.util.HashSet;
import java.util.Scanner;

/*
 2. Вводится день недели. Напишите тип это дня (выходной или рабочий). Используйте для этого set.
    2.1 Если такого дня не существует - напишите "Ошибка".
 */
public class Main {

    public static void main(String[] args) {
        HashSet<String> workingDays = new HashSet<>();
        HashSet<String> weekendDays = new HashSet<>();

        Scanner scanner = new Scanner(System.in);

        workingDays.add("понедельник");
        workingDays.add("вторник");
        workingDays.add("среда");
        workingDays.add("четверг");
        workingDays.add("пятница");

        weekendDays.add("суббота");
        weekendDays.add("воскресенье");

        System.out.println("Введите день недели: ");
        String input = scanner.next().trim();

        if (workingDays.contains(input.toLowerCase())) {
            System.out.println(input + " это рабочий день.");
        } else if (weekendDays.contains(input.toLowerCase())) {
            System.out.println(input + " это выходной.");
        } else System.out.println("Ошибка");

        scanner.close();

    }
}
