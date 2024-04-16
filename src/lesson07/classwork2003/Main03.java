package lesson07.classwork2003;

import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int days = 0;

        switch (n) {
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10:
            case 12:
                days = 31;
                break;

            case 4 :
            case 6 :
            case 9 :
            case 11 :
                days = 30;
                break;

            case 2 :
                days = 28;
                break;
        }
        System.out.println(days);
    }
}
