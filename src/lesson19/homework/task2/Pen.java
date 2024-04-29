package lesson19.homework.task2;

public class Pen {
   // public static Object checkInk;
    private static int inkVolume = 100;

    public int getInkVolume() {
        return inkVolume;
    }

    public void setInkVolume(int inkVolume) {
        this.inkVolume = inkVolume;
    }

    private String inkColor;
    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

    public Pen(String inkColor) {
        this.inkColor = inkColor;
    }

    void write(String str) {

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (inkVolume > 0) {
                System.out.print(inkColor + currentChar + RESET);
                inkVolume -= (currentChar == ' ') ? 0 : 1;
            }
        }
    }

    static void refil() {
        inkVolume = 100;
    }

   static void checkInk() {
        System.out.println("Ink remain for " + inkVolume + " letters!" );
    }

}








