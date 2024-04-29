package lesson19.homework.task2;

import static lesson19.homework.task2.Pen.*;

public class Main {
    public static void main(String[] args) {
        Pen redPen = new Pen(RED);

        for (int i = 0; i < 1000; i++) {

            redPen.write(Integer.toString(i) + " ");
        }

        checkInk();
        refil();
        redPen.write("test");
        checkInk();



    }

}
