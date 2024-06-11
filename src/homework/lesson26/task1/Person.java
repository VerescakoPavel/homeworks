package homework.lesson26.task1;

public class Person {


    private String Name;
    private int age;
    private UserType UserType;

    public Person(String name, int age, UserType userType) {
        this.age = age;
        Name = name;
        UserType = userType;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public homework.lesson26.task1.UserType getUserType() {
        return UserType;
    }

    public void setUserType(homework.lesson26.task1.UserType userType) {
        UserType = userType;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", Name='" + Name + '\'' +
                ", UserType=" + UserType +
                '}';
    }
}
