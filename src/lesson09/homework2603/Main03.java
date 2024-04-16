package lesson09.homework2603;

import java.util.Random;
import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] randomNum = new int[10];

        for (int i = 0; i < randomNum.length - 1; i++) {
            randomNum[i] = random.nextInt(100);
            System.out.print(randomNum[i] + "; ");
        }
        System.out.print(randomNum[randomNum.length -1] = random.nextInt(100));


        System.out.println();



        System.out.println("Введите значение любого элемента. :");
        int inputNum = scanner.nextInt();
        int index = -1;
        for (int i = 0; i < randomNum.length ; i++) {
            if (inputNum == randomNum[i]) {
                index = i;
                break;
            }
        }
        System.out.println(index == -1 ? "В этом массиве нет такого элемента " : "Индекс элемента с этим значением = " + index);

    }
}
