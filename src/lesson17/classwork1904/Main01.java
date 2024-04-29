package lesson17.classwork1904;

public class Main01 {
    public static void main(String[] args) {

        Cat cat = new Cat();

        cat.SayMeow();
        cat.run();
        cat.sleep();

        String catName = cat.name;
        System.out.println("Name " + cat.name);

        System.out.println("Color: " + cat.color);
        System.out.println("Age: " + cat.age);

        Cat cat1 = new Cat("Max");

        System.out.println("Color cat1: " + cat1.color);
        System.out.println("Name cat1: " + cat1.name);
    }

}
