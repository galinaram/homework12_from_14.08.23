package homework12;

import java.util.Scanner;

public class Book {
    private String name;
    private Author author;
    private int year;
    private Book book;

    public Book () {
        name = "имя книги";
        author = new Author();
        year = 1999;
    }
    public String getName() {
        return name;
    }
    public Author getAuthor() {
        return author.getAuthor();
    }
    public int getYear() {
        return year;
    }
    public int setYear (int y) {
        this.year = y;
        return this.year;
    }
    public Book writeBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите название книги: ");
        name = scanner.nextLine();
        author.writeAuthor();

        System.out.println("введите год издания книги");
        year = scanner.nextInt();
        return this;
    }
    public void printBook() {
        System.out.println("название книги: " + name);
        author.printAuthor();
        System.out.println("год издания: " + year);
    }
}
