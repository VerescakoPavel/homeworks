package lesson12.homework0804;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        String[] productName = {"lemon", "potato", "kefir", "alcohol"};
        float[] productPrice = {1.25f, 1.09f, 1.59f, 20};
        int [] productQuantity = {50, 20, 10, 100};

        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();

        for (int i = 0; i < productName.length; i++) {
            if (input.equalsIgnoreCase(productName[i])) {
                System.out.println(productName[i] + " is " + productPrice[i] + " Eur");
                System.out.println("Remain " + productQuantity[i] + " on stock");
                return;
            }

        } System.out.println("Not in stock");
    }
}
