package homework.lesson27.taskOOP;

public class Investments {
    private double amount;
    private int years;
    private int rate;

    public double profitCalc() {
        return amount * Math.pow(1 + (rate / 100.0), years) - amount;
    }

    public Investments(double amount, int years, int rate) {
        this.amount = amount;
        this.years = years;
        this.rate = rate;
    }

    public double getAmount() {
        return amount;
    }

    public int getYears() {
        return years;
    }

    public int getRate() {
        return rate;
    }


}
