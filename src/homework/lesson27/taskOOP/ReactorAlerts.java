package homework.lesson27.taskOOP;

public class ReactorAlerts {

    public static final double OVERHEATING_LIMIT_PERCENT = 20.0;
    public static final double AVERAGE_TEMPERATURE_INCREASE_LIMIT_COEFF = 1.1; // 10% of average temperature

    public static void overheatingAlertCheck(double currentTemperature, double previousTemperature, double averageTemperature) {
        int TWENTY_PERCENT = 20;
        double averageTemperaturePlus10Percent = averageTemperature * AVERAGE_TEMPERATURE_INCREASE_LIMIT_COEFF;
        if (currentTemperature > previousTemperature) {
            double temperatureDifferanceInPercent = (currentTemperature - previousTemperature) * 100 / previousTemperature;
            System.out.println((currentTemperature > averageTemperaturePlus10Percent) && (temperatureDifferanceInPercent > OVERHEATING_LIMIT_PERCENT) ? "Тревога, превышение температуры" : "");
        }
    }



}
