package lesson06.homework1903;

import java.util.Scanner;
/*
Program to check if someone form your contact have birthday today.
 */
public class Main03 {
    public static void main(String[] args) {
        String[] names = {"Wife", "Mom", "Dad", "Bro"};
        String[] dates = {"01/03/1989", "14/06/1966", "11/10/1964", "01/11/1987"};

        Scanner scaner = new Scanner(System.in);
        System.out.println("Enter today date in format DD/MM/YYYY");
        String todayDate = scaner.next();
        int birthDaycount = 0;

        for (int i = 0; i < dates.length ; i++) {
            if (dates[i].substring(0, 5).equals(todayDate.substring(0, 5))) {               // check only date and month
                System.out.println("Today yours " + names[i] + " Birthday");
                int age = Integer.parseInt(todayDate.substring(6)) - Integer.parseInt(dates[i].substring(6)) ;
                System.out.println("She/He is " + age + " years old");
                birthDaycount++;
            }


        }
        System.out.print(birthDaycount > 0 ? "Don't forget to congratulate" : "Today nobody's birthday");
    }
}
