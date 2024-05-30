package homework.lesson23;

import java.util.Arrays;
import java.util.Random;

public class Main {


    public static int bobbleSorting(int[] arr) {
        int buff = 0;
        int count = 0;
        boolean sortingFlag = false;

        for (int j = 1; j < arr.length - 1; ++j) {
            for (int i = 0; i < arr.length - j; ++i) {
                ++count;
                if (arr[i] > arr[i + 1]) {
                    buff = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = buff;
                    count += 3;
                    sortingFlag = true;
                }
            }

            if (!sortingFlag) {
                break;
            }
        }

        return count;
    }

    public static int selectionSort(int[] arr) {
        int count = 0;
        int buff = 0;

        for (int j = 0; j < arr.length - 1; ++j) {
            int minIndex = j;

            for (int i = j + 1; i < arr.length; ++i) {
                ++count;
                if (arr[i] < arr[minIndex]) {
                    minIndex = i;
                }
            }

            buff = arr[minIndex];
            arr[minIndex] = arr[j];
            arr[j] = buff;
            count += 3;
        }

        return count;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        Random random = new Random(100L);
        int[] array = new int[100];
        int[] arrayClone = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            arrayClone[i] = array[1];
        }


        System.out.println(Arrays.toString(array));
        int bobbleOperationsCounter = bobbleSorting(array);
        System.out.println();
        System.out.println(Arrays.toString(array));
        System.out.println();
        System.out.println("BobbleSort swaps done: " + bobbleOperationsCounter);
        int selectionSortCounter = selectionSort(arrayClone);
        System.out.println(Arrays.toString(arrayClone));
        System.out.println();
        System.out.println("SelectionSort swaps done: " + selectionSortCounter);
    }
}
