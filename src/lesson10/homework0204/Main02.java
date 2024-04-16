package lesson10.homework0204;

import java.util.Random;

public class Main02 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int buff = 0;

        for (int i = 0; i < array.length / 2; i++) {
            buff = array[i];
            array[i] = array[(array.length - 1) - i];
            array[(array.length - 1) - i] = buff;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
