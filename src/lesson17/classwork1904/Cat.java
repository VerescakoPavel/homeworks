package lesson17.classwork1904;

public class Cat {
    String name;
    String color;
    int age;

public Cat(){

}

public Cat(String catName){
    name = catName;
}

public Cat(String catName, String color){
    name =catName;
    this.color = color;
}
    public void sleep() {
        System.out.println("Im sleeping!");
    }

    void run(){
        System.out.println("Im running!");
    }

    void SayMeow() {
        System.out.println("Meow!");
    }

}
