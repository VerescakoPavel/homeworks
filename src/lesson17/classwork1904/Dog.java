package lesson17.classwork1904;



public class Dog {

    String name;
    int weight;

    public Dog(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    String whoAmI() {
        return "I am a dog " + this.name + ", my weight: " + this.weight;
    }

    void eat(){
        System.out.println("Im eating");
        weight++;
    }

    void run() {


        while (weight < 3) {
            System.out.println("Im tyred, need to eat");
            System.out.println("My weight is " + weight);

            eat();
        }

            System.out.println("Im running");
            weight -= 2;

    }


}
