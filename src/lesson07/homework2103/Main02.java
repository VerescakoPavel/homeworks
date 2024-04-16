package lesson07.homework2103;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int petals = scaner.nextInt() % 6;
        System.out.println(petals);

        switch (petals) {
            case 1:
                System.out.println("I love you");
                break;
            case 2:
                System.out.println("a little");
                break;
            case 3:
                System.out.println("a lot");
                break;
            case 4:
                System.out.println("passiontelly");
                break;
            case 5:
                System.out.println("Madly");
                break;
            case 0:
                System.out.println("Not at all");
                break;

        }

    }
}
