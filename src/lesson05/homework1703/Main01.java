package lesson05.homework1703;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Pls Enter Bruto in EUR : ");
        int Brutto = scanner.nextInt();

        float PensionFond = Brutto * 0.03f;
        float EarningTax = 0.0F;
        float Netto = 0.0F;
        String earningTaxPercent = "";

        if (Brutto >= 20_000) {
             earningTaxPercent = " 22% ";
             EarningTax =  Brutto * 0.22f ;
             Netto = (Brutto - PensionFond - EarningTax);
        } else if (Brutto >= 10_000) {
             earningTaxPercent = " 18% ";
             EarningTax =  Brutto * 0.18f ;
             Netto = (Brutto - PensionFond - EarningTax);
        } else {
             earningTaxPercent = " 13% ";
             EarningTax = Brutto * 0.13f;
             Netto = (Brutto - PensionFond - EarningTax);
        }
        System.out.println("Your Brutto salary is " + Brutto + " Euro.");

        System.out.println("Your Pension Fond Taxes is 3% :" + PensionFond + " Euro.");
        System.out.println("Your Earning Taxes is "+ earningTaxPercent + EarningTax + " Euro");
        System.out.println("Your Netto salary is " + Netto + " Euro");

    }
}
