package homework.lesson27.taskOOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReactorTemperatureMonitor {

    Scanner scanner = new Scanner(System.in);
    private final List<Double> reactorTemperatureHistory = new ArrayList<>();

    public void startMonitor() {

        System.out.println(("Pls enter reactor temperature (°C): "));
        reactorTemperatureHistory.add(scanner.nextDouble());
        double currentTemperature;
        double previousTemperature;
        double averageTemperature;
        double sumEach100thElement;
        int countEach100thElement = 0;

        while (true) {
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Pls enter reactor temperature (°C): ");
            currentTemperature = scanner.nextDouble();
            previousTemperature = reactorTemperatureHistory.getLast();
            reactorTemperatureHistory.add(currentTemperature);
            averageTemperature = TemperatureCalculator.averageTempCalc(reactorTemperatureHistory);
            System.out.println("Average Temperature: " + averageTemperature + "°C");
            TemperatureCalculator.temperatureDifferenceInfo(currentTemperature, previousTemperature);
            ReactorAlerts.overheatingAlertCheck(currentTemperature, previousTemperature, averageTemperature);

            if (reactorTemperatureHistory.size() >= 10) {
                System.out.println("Last 10 measurements average temperature : " + TemperatureCalculator.averageTempCalc(reactorTemperatureHistory.subList(reactorTemperatureHistory.size() - 10, reactorTemperatureHistory.size() - 1)) + "°C");
            }

            if (reactorTemperatureHistory.size() % 100 == 0) {
                sumEach100thElement = currentTemperature;
                countEach100thElement++;
                System.out.println("Average each 100th measurements temperature : " + sumEach100thElement / countEach100thElement + "°C");
            }
        }
    }

}
