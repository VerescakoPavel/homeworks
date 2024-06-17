package homework.lesson29.task1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
1. Вводится 5 чисел. Напишите "Yes", если они не все равны между собой.
    1.1 Нужно использовать Set
    1.2 Запрещено писать в if условие (1 == 2 и 2 == 3 и 3 == 4), contains использовать нельзя
 */
public class Main {

    public static void main(String[] args) {

        Set<Integer> inputSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pls enter 5 integer numbers");
        for (int i = 0; i < 5; i++) {
            if (scanner.hasNextInt()) {
                inputSet.add(scanner.nextInt());
            } else {
                System.out.println("Wrong input, only integer numbers;");
                scanner.next(); // считываем неверное значения и никуда его не записываем (пропускаем)
                i--;
            }
        }
        scanner.close();
        System.out.println(inputSet.size() >= 2 ? "No" : "Yes");
    }
}
