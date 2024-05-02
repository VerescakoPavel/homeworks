package lesson18.homework;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Pavel", "Verescako", "12.07.1993",
                "Navigation", 4);


    Book book = new Book("Chapayev and Void", "Pelevin", "Psychological Fiction", 1996);

    student1.studentRead(book);
    }
}
