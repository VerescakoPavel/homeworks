package lesson20.classwork2404;

public class Main {

    public static void main(String[] args) {
        Human Mihail = new Human("Mihail", 28);
        Human Olga = new Human("Olga", 27);

        System.out.println(Mihail.getName());
        System.out.println(Olga.getName());

        System.out.println("Spiecies: " + Mihail.species);

        Olga.species = "Domestic cat";
        System.out.println("Species: " + Mihail.species);
    }
}
