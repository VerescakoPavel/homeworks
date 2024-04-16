package lesson09.classwork2503;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int summa = 0;
        boolean condition = true;
        int number = 0;

        do {
            number = sc.nextInt();
            summa += number;
        } while (number != 0);

       // while (condition) {


         //   int userNumber = sc.nextInt();
            //if (userNumber >= 0) {
             //   summa = summa + userNumber;
            //} else {
              //  condition = false;
          //  }
        //}

       System.out.println("Сумма всех введенных чисел = " + summa);
    }
}

