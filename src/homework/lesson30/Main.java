package homework.lesson30;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
1. Пользователи вводят поисковые запросы (просто строка в консоли),
2. В ответ пользователю напишите, сколько раз такая строка уже искалась другими пользователями
2.1 Если строка искалась более 100 раз, то дальнейшее количество попыток поиска не учитывается (значение замирает на 100)

Дополнительное задание:
1. Придумать, как проверить решение, передав в код какую-либо строку более 100 раз (сделать можно любым способом: код на джаве, каким-либо сочетанием клавиш)
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QueryCounter queryCollection = new QueryCounter();

        for (int i = 0; i < 101; i++) {   // Дополнительное задание
            queryCollection.queryCounter("test");

        }
        while (true) {
            String input = scanner.nextLine().toLowerCase();

            if (input.equals("exit")) break;

            int result = queryCollection.queryCounter(input);

            System.out.println("Question \"" + input + "\" asked " + result + " times");

        }
    }

}
