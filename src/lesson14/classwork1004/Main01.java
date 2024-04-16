package lesson14.classwork1004;

import java.util.Random;

public class Main01 {
    public static void printArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] generatRandomArray(int min, int max, int size) {
        Random random = new Random();

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = min + random.nextInt(max - min + 1);

        }

        return array;

    }

    public static  void revervseArray (int[] arr) {
        int[] reversedArray = new int[arr.length];

        for (int i = 0; i < reversedArray.length; i++) {
            reversedArray[i] = arr[reversedArray.length - i - 1];
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = reversedArray[i];

        }
    }

    public static void main(String[] args) {

        int[] array = generatRandomArray(1, 100, 10);

        printArray(array);
        revervseArray(array);
        System.out.println();
        printArray(array);

    }
}

