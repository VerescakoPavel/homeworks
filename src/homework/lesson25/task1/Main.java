package homework.lesson25.task1;


import java.util.Arrays;
import java.util.Scanner;

/*
1.Пользователь вводит в консоль 10 чисел.
2.Соберите их в массив и отсортируйте (любым способом, кроме заложенных в джава)
3. Бинарным поиском найдите число в этом массиве, которое пользователь введет 11ым. Выведите его индекс на экран

Усложнения для первого задания:
1. Вводится не 10 чисел, а строка содержащая числа, записанные через пробелы
2. Бинарный поиск обязательно должен быть реккурсивным
 */
public class Main {

    public static void selectionSort(int[] arr) {
        int buff = 0;

        for (int j = 0; j < arr.length - 1; ++j) {
            int minIndex = j;

            for (int i = j + 1; i < arr.length; ++i) {
                if (arr[i] < arr[minIndex]) {
                    minIndex = i;
                }
            }

            buff = arr[minIndex];
            arr[minIndex] = arr[j];
            arr[j] = buff;

        }
    }

    public static int binarySearch(int[] arr, int x, int min, int max) {
        if (min > max) {
            return -1;
        }
        int mid = (min + max) / 2;
        int index = -1;

        if (x == arr[mid]) {
            index = mid;
        }
        if (min == max && x != arr[mid]) {
            return -1;
        }
        if (arr[mid] > x) {
            index = binarySearch(arr, x, min, mid - 1);
        }
        if (arr[mid] < x) {
            index = binarySearch(arr, x, mid + 1, max);
        }

        return index;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");
        int[] array = new int[inputArray.length];


        for (int i = 0; i < inputArray.length; i++) {
            array[i] = Integer.parseInt(inputArray[i]);
        }

        selectionSort(array);
        System.out.println(Arrays.toString(array));

        int searchingNumber = scanner.nextInt();
        int searchingIndex = binarySearch(array, searchingNumber, 0, array.length - 1);
        System.out.println(searchingIndex >= 0 ? "Your number is in array with index : " + searchingIndex
                : "Your number is not in array");
    }
}
