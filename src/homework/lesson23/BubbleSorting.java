package homework.lesson23;

public class BubbleSorting {
    static int buff = 0;
    static int count = 0;
    static boolean sortingFlag = false;

    public static int bobbleSorting(int[] arr) {
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
        }return(count);
    }


    }
