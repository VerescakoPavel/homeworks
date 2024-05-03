package lesson04.homewor1303;

import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Pls Enter Bruto in EUR : ");
        int Brutto = scanner.nextInt();

        double PensionFond = Brutto * 0.03;
        double EarningTax = Brutto * 0.15;
        double Netto = Brutto - PensionFond - EarningTax;

        System.out.println("Your Brutto salary is " + Brutto + " Euro.");
        System.out.println("Your Pension Fond Taxes is " + PensionFond + " Euro.");
        System.out.println("Your Earning Taxes is " + EarningTax + " Euro");
        System.out.println("Your Netto salary is " + Netto + " Euro");

    }
}
