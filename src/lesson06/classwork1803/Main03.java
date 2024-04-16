package lesson06.classwork1803;

import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        float num = scaner.nextFloat();

        if (num > (int) num) { //num % 1 == 0
            System.out.println("Number is Float");
        } else {
            System.out.println("Number is Integer");
        }
    }
}
