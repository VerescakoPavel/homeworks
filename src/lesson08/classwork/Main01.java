package lesson08.classwork;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean isSimple = true;
        int userInt = scanner.nextInt();

        for (int i = 2; i < userInt; i++) {
            if (userInt % i == 0) {
                isSimple = false;
            }
        }
        System.out.println(isSimple ? userInt : "not simple");




    }
}
