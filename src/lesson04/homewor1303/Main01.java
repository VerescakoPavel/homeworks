package lesson04.homewor1303;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Pls Enter Bruto in EUR : ");
        int Brutto = scanner.nextInt();

        double PensionFond = Brutto * 3 ;
        double EarningTax =  Brutto * 15 ;
        double Netto = (Brutto * 100  - PensionFond - EarningTax) / 100;

        System.out.println("Your Brutto salary is " + Brutto + " Euro.");
        System.out.println("Your Pension Fond Taxes is " + PensionFond / 100 + " Euro.");
        System.out.println("Your Earning Taxes is " + EarningTax / 100 + " Euro");
        System.out.println("Your Netto salary is " + Netto + " Euro");

    }
}
