package lesson22.classwork2904.example02;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("Germany", "Berlin", "Weserste. 48");

        Human human1 = new Human("Nadja", address);
        Human human2 = new Human("Pashusha", address);

        human1.introduce();
        human2.introduce();


    }
}
