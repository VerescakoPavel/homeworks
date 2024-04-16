package lesson05.classwork1503;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        String hidenPassword = "*********************************************************************";;
        String password = null;
        if (age < 13) {
            System.out.println("To young. Return when become 13 years old");
        } else {
            System.out.println("Enter you login :");
            String login = scanner.next();
            System.out.println("Password :");
            password = scanner.next();


            System.out.println("Successfully registration");
            System.out.println("Login :" + login);


            
            System.out.println("Password :" + hidenPassword.substring(0, password.length()));
        }

    }
}