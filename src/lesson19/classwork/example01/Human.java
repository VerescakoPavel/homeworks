package lesson19.classwork.example01;

public class Human {
    private String name;
    private int age;

    Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public void sayHello() {
        System.out.println("Hi, Im " + name + " and I am " + age + " years old");
    }


}
