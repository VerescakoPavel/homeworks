package homework.lesson27;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
1) Пользователь бесконечно вводит числа в программу - температуру ядерного реактора.
2) После КАЖДОГО введеного числа сообщите пользователю информацию:
2.1) Среднее значение температуры ядерного за ВСЕ время
2.2) Насколько текущая введеная температура отличается от предыдущей
2.3) Если введеная температура превышает среднюю на 10% и повысилась относительно предыдущего значения более, чем на 20%,
    То напишите на экран собщение "Тревога, превышение температуры"

Усложненное задание:
3.1) Рассчитайте также среднюю температуру за 10 последних измерений и среднюю температуру каждого 100ого измерения
 */
public class Main {

    public static double averageTempCalc(List<Double> reactorTemperatureHistory) {
        double sum = 0;
        for (int i = 0; i < reactorTemperatureHistory.size(); i++) {
            sum += reactorTemperatureHistory.get(i);
        }
        return sum / reactorTemperatureHistory.size();
    }

    public static void temperatureDifferenceInfo(double currentTemperature, double previousTemperature) {
        if (currentTemperature > previousTemperature) {
            System.out.println("Reactor temperature increased on " + (currentTemperature - previousTemperature) + "°C");
        } else if (currentTemperature < previousTemperature) {
            System.out.println("Reactor temperature decreased on " + (previousTemperature - currentTemperature) + "°C");
        } else System.out.println("Temperature not changed");
    }

    public static void overheatingAlertCheck(double currentTemperature, double previousTemperature, double averageTemperature) {
        int TWENTY_PERCENT = 20;
        double averageTempPlus10Percent = averageTemperature * 1.1;
        if (currentTemperature > previousTemperature) {
            double tempDifferanceInPercent = (currentTemperature - previousTemperature) * 100 / previousTemperature;
            System.out.println((currentTemperature > averageTempPlus10Percent) && (tempDifferanceInPercent > TWENTY_PERCENT) ? "Тревога, превышение температуры" : "");
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Double> reactorTemperatureHistory = new ArrayList<>();
        List<Double> reactorTemperatureLast10 = new ArrayList<>();
        List<Double> reactorTemperatureEach100thPstn = new ArrayList<>();
        System.out.println("Pls enter reactor temperature (°C): ");
        reactorTemperatureHistory.add(scanner.nextDouble());
        double currentTemperature;
        double previousTemperature;
        double averageTemperature;


        while (true) {
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Pls enter reactor temperature (°C): ");
            currentTemperature = scanner.nextDouble();
            previousTemperature = reactorTemperatureHistory.getLast();
            reactorTemperatureHistory.add(currentTemperature);
            averageTemperature = averageTempCalc(reactorTemperatureHistory);
            System.out.println("Average Temperature: " + averageTemperature + "°C");
            temperatureDifferenceInfo(currentTemperature, previousTemperature);
            overheatingAlertCheck(currentTemperature, previousTemperature, averageTemperature);

            reactorTemperatureLast10.add(currentTemperature);
            if (reactorTemperatureHistory.size() >= 10) {
                System.out.println("Avarage of last 10 temperatures : " + averageTempCalc(reactorTemperatureLast10) + "°C");
                reactorTemperatureLast10.removeFirst();
            }
            if (reactorTemperatureHistory.size() % 100 == 0) {
                reactorTemperatureEach100thPstn.add(currentTemperature);
                System.out.println("Avarage of each 100th temperature messurement : " + averageTempCalc(reactorTemperatureEach100thPstn) + "°C");
            }

        }
    }
}
