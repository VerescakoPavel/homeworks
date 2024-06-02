package homework.lesson23;

import java.beans.PropertyEditorSupport;
import java.util.Arrays;
import java.util.Random;

public class BinarySearch {
    static int buff = 0;

    static boolean sortingFlag = false;

    public static void bobbleSorting(int[] arr) {
        for (int j = 1; j < arr.length - 1; ++j) {
            for (int i = 0; i < arr.length - j; ++i) {

                if (arr[i] > arr[i + 1]) {
                    buff = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = buff;
                    sortingFlag = true;
                }
            }

            if (!sortingFlag) {
                break;
            }
        }

    }


    public static int binarySearch(int[] arr, int x) {
      int min = 0;
      int max = arr.length - 1;
      int mid = 0;
      int index = -1;
      int count = 0;
        while (min <= max) {
            mid = (min + max) / 2;
            ++count;
            if (x == arr[mid]) {
                System.out.println(count);
                index = mid;
                break;

            } else if (x > arr[mid]) {
            min = mid + 1;
            } else {
                max = mid - 1;
            }

        }
return index;
    }
public static void main(String[] args) {
    Random random = new Random(100);
    int[] array = new int[100];

    for (int i = 0; i < array.length; i++) {
        array[i] = random.nextInt(100);
}
    bobbleSorting(array);
    System.out.println(Arrays.toString(array));
    int result = binarySearch(array, 0);
    System.out.println(result );
}
}