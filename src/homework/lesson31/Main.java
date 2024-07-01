package homework.lesson31;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
1. Создайте класс Message. Этот класс будет позволять хранить в себе сообщение любого типа.
2. Для того, чтобы Message мог хранить в себе любой тип данных, создайте поле в этом классе, тип которого будет является дженериком
3. Создайте приложение, которое спрашивает у пользователя, что положить в Message.
3.1 Если пользователь хочет положить строку - создайте Message<String> и дайте пользователю ввести строку
3.2 Если же пользователь хочет положить число - создайте Message<Integer> и дайте пользователю ввести число
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pls choose \"String\" or \"Integer>\"");

        while (true) {

            String inputType = scanner.nextLine().toLowerCase().trim();

            switch (inputType) {

                case ("string"):
                    System.out.println("you choose String, pls enter msg : ");
                    Message<String> stringMsg = new Message<>();
                    stringMsg.setObject(scanner.nextLine());
                    System.out.println("Msg you put is : " + stringMsg.getObject());
                    scanner.close();
                    return;

                case ("integer"):
                    System.out.println("you choose Integer, pls enter number : ");

                    if (scanner.hasNextInt()) {
                        Message<Integer> integerMsg = new Message<>();
                        integerMsg.setObject(scanner.nextInt());
                        System.out.println("You put number : " + integerMsg.getObject());
                    } else {
                        System.out.println("Msg that you put is not an Integer");
                        scanner.nextLine();
                    }
                    scanner.close();
                    return;

                default:
                    System.out.println("Pls choose between String and Integer");
            }

        }
    }

}


