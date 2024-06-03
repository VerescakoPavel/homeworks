package homework.lesson24.task2;

import java.util.Arrays;
import java.util.Scanner;

/*
Задание 2.
1. Пользователь вводит строку вида: "число знак число". Например:
а) 4 + 4
б) 23 * 78
в) 12 / 45
г) 3 - 7
2. Рассчитайте значение числового выражения
3. Для помощи: можете воспользоваться методами Integer.parseInt, split, equals
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pls enter an expression (e.g. 4 + 4): ");
        String input = scanner.nextLine().replace(" ", ""); // читаем и избавляем строку от лишних пробелов.

        String[] inputArray = input.split("(?<=[-+*/])|(?=[-+*/])"); //делим строку на число до знака, знак и число после знака
        System.out.println(Arrays.toString(inputArray));


        if (inputArray.length != 3) {
            System.out.println("Something go wrong, pls try again");
            return;
        }
        int firstNumber = Integer.parseInt(inputArray[0]);
        int secondNumber = Integer.parseInt(inputArray[2]);
        double result = 0;

        switch (inputArray[1]) {

            case "+":
                result = firstNumber + secondNumber;
                break;

            case "-":
                result = firstNumber - secondNumber;
                break;

            case "*":
                result = firstNumber * secondNumber;
                break;

            case "/":
                if (secondNumber == 0) {
                    System.out.println("Divide on '0' prohibited");
                    break;
                }
                result = (double) firstNumber / secondNumber;
                break;

            default:
                System.out.println("Wrong input, pls restart program");

        }
        System.out.println(firstNumber + " " + inputArray[1] + " " + secondNumber + " = " + result);
    }
}
