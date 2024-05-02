package lesson18.homework;

public class Student {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String choosedSubject;
    private int course;



    public Student(String firstName, String lastName, String dateOfBirth, String choosedSubject, int course) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.course = course;
        this.choosedSubject = choosedSubject;
    }

    public void learning() {
        System.out.println(lastName + " учится на " + course + " курсе по специальности " + choosedSubject);
    }
    public void studentRead(Book book) {
        System.out.println(firstName + " читает книгу " + Book.bookName);
    }
}
