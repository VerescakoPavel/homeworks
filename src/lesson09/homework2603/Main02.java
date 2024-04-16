package lesson09.homework2603;
/*
Считать из консоли начальное значение, шаг и количество элементов числовой последовательности.
В этой последовательности каждый следующий элемент должен быть ровно на один шаг больше предыдущего.
Записать последовательность в массив, посчитать и вывести на экран сумму этих элементов.

Важно: для решения этой задачи существует математическая формула, но в данном задании нужно использовать
именно циклы и массивы.

Пример 1:
    Ввод:
    1
    3
    4
    Вывод:
    Сумма = 22
 */


import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = scanner.nextInt();
        int nextNumber = firstNum;
        int step = scanner.nextInt();
        int elements = scanner.nextInt();
        int sum = firstNum;

        for (int i = 1; i < elements; i++) {
            nextNumber += step;
            sum += nextNumber;
        }
        System.out.println(sum);
    }
}
