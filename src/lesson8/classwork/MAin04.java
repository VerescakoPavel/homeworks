package lesson8.classwork;

public class MAin04 {
    public static void main(String[] args) {
        int n = 1;

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                n = i * j;
                System.out.println(i + " * " + j + " = " + n);

            }
            System.out.println();

        }
    }
}
