package lesson07.classwork2003;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String answer;
        switch (n) {
            case 0:
                answer = "zero";
                break;
            case 1:
                answer = "one";
                break;
            case 2:
                answer = "two";
                break;
            case 3:
                answer = "three";
                break;
            case 4:
                answer = "four";
                break;
            case 5:
                answer = "five";
                break;
            case 6:
                answer = "six";
                break;
            case 7:
                answer = "seven";
                break;
            case 8:
                answer = "eight";
                break;
            case 9:
                answer = "nine";
                break;
            default:
                answer = "undefined";
        }

        System.out.println(answer);



    }
}
