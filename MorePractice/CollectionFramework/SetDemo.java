package CollectionFramework;

import java.util.*;

public class SetDemo {
    private static void hashSetDemo() {
        Set<String> set1 = new HashSet<>();
        set1.add("a");
        set1.add("n");
        set1.add("c");
        set1.add("a");
        System.out.println("set1: " + set1);

        Book book1 = new Book("Walden1", "henry", 1);
        Book book2 = new Book("Walden1", "henry", 2);
        Book book3 = new Book("Walden1", "henry", 3);
        Book book4 = new Book("Walden1", "henry", 1);
        Set<Book> set2 = new HashSet<>();
        set2.add(book1);
        set2.add(book2);
        set2.add(book3);
        set2.add(book4);
        System.out.println("Set 2: " + set2);

    }

    public static void main(String[] args) {
        hashSetDemo();
    }
}

class Book {
    private String title;
    private String author;
    private int year;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Book(String title, String author, int year) {
        super();
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book : [Title : " + title + ", Author : " + author + ", Year : " + year + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Book)) {
            return false;
        }
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author) && year == book.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, year);
    }

}