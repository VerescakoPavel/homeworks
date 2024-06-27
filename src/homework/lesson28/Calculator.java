package homework.lesson28;

public class Calculator {

    public static double profitCalc(int amount, int years, int percent) {
        return (double) (amount * Math.pow(1 + (double) percent / 100, years) - amount);
    }
}
