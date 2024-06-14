package homework.lesson27.taskOOP;

import java.util.List;

public class TemperatureCalculator {


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
}
