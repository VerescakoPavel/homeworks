package lesson13.homework1004;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Pls choose option (only number)");
            System.out.println("0. Exit");
            System.out.println("1. C -> F");
            System.out.println("2. F -> C");

            int input = scanner.nextInt();

            if (input == 0) {
                return;
            }
            if (input < 0 || input > 2) {
                System.out.println("Wrong input, pls try again");
                continue;
            }
            System.out.println("Pls enter degrees: ");
            double degree = scanner.nextDouble();

            System.out.println(input > 1 ? degree + "°F -> " + toCelsius(degree) + "°C"
                                         : degree + "°C -> " + toFahrenheit(degree) + "°F");
            System.out.println();
        }
    }

    public static double toFahrenheit(double degree) {
        return (degree * (9f/5f) + 32);
    }

    public static double toCelsius (double degree){
        return (degree - 32f) * (5f/9f);

    }
}
