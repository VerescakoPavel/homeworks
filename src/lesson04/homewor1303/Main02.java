package lesson04.homewor1303;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Your weight in kg :");
        int weight = scanner.nextInt();

        System.out.print("Your height in cm :");
        float height = (float) scanner.nextInt() / 100;

        float BMI =  weight / (height * height);
        System.out.println("You BMI : " + BMI);
    }
}
