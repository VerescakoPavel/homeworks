package lesson09.classwork2503;

import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // System.out.println("Pls enter Number : ");
     //   int n = scanner.nextInt();
        int[] array = new int[10];
        //int result = 1;
        for (int i = 0; i < array.length; i++) {
            //result *= 2;

       array[i] = (int) Math.pow(2, i);
            System.out.println(array[i]);
        }
        for (int i = array.length - 1 ; i > 1; i--) {
            System.out.println(array[i]);

        }

    }
}
