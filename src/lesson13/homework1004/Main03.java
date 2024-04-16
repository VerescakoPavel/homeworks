package lesson13.homework1004;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int weight = askParameters("вес", "(кг)");
        int height = askParameters("рост", "(см)");
        float heightInMeter = cmToMeters(height);
        float BMI = BMIcalc(weight, heightInMeter);
        printResult(BMI);
    }



    public static int askParameters(String parameter, String mesurment) {
        System.out.print("Ваш " + parameter + " в " + mesurment);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static float cmToMeters(int cm) {
        return  cm / 100f;
    }

    public static float BMIcalc(int weight, float height) {
    return weight / (height * height);
    }

    public static float printResult (float BMI) {
        System.out.println("You BMI : " + BMI);
        if (BMI < 0) {
            System.out.println("Что-то не так. Попробуйте снова.");
        } else if (BMI < 15) {
            System.out.println("У Вас анорексия.");
        } else if (BMI < 20) {
            System.out.println("У Вас недостаточный вес.");
        } else if (BMI < 25) {
            System.out.println("У Вас нормальный вес.");
        } else if (BMI < 30) {
            System.out.println("У Вас лишний вес.");
        } else System.out.println("У Вас ожирениее.");

return (0);
    }

}
