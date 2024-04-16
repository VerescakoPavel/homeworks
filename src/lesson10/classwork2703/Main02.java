package lesson10.classwork2703;

import java.util.Random;
import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        Random random = new Random();
        int[] numbers = new int[size];
      //  int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
            System.out.print(numbers[i] + "; ");
        //    sum += numbers[i];
        }
        //System.out.println((double) sum / size);


    }
}
