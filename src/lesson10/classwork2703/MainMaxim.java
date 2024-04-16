package lesson10.classwork2703;

import java.util.Random;

public class MainMaxim {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        int[] reversedArray = new int[10];

        for (int i = 0; i < array.length; i++) {

                array[i] = random.nextInt(100);
                System.out.print(array[i] + " ");
            }
            System.out.println();

        for (int i = array.length - 1; i >= 0; i--){
                reversedArray[(array.length - 1) -i] = array[i];

            }
        for (int i = 0; i < array.length; i++) {
            System.out.print(reversedArray[i] + " ");

        }
        }
    }


