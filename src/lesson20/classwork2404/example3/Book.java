package lesson20.classwork2404.example3;

public class Book {

        private int id;
        private String title;
        private String authorName;

        private String genre;

        private int pagesamount;
        private int yearPublished;
        private boolean available;

    public Book(int id, String title, String authorName, String genre, int pagesamount, int yearPublished, boolean available) {
        this.id = id;
        this.title = title;
        this.authorName = authorName;
        this.genre = genre;
        this.pagesamount = pagesamount;
        this.yearPublished = yearPublished;
        this.available = available;
    }

   /* public boolean isAvailable() {
    }

    public String getTitle() {
        this.title = title;
    }

    public void setAvailable(boolean b) {
    } */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPagesamount() {
        return pagesamount;
    }

    public void setPagesamount(int pagesamount) {
        this.pagesamount = pagesamount;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
