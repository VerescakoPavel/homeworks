package lesson10.homework0204;

import java.util.Random;
import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] answers = {"Да.",
                "Нет.",
                "Весьма вероятно.",
                "Не рассчитывай на это.",
                "Не могу предсказать.",
                "Да, но будь осторожен.",
                "По всей видимости.",
                "Знаки указывают на \"да\".",
                "Знаки указывают на \"нет\"."
        };

        String question = scanner.next();
        Random random = new Random(question.hashCode());
        System.out.println(answers[random.nextInt(answers.length)]);




    }
}
