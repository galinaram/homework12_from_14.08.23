package homeworkk13;

import java.util.Scanner;

public class Author {
    private String firstName;
    private String secondName;
    public Author () {
        firstName = "имя автора";
        secondName = "фамилия автора";
    }
    public String getFirstName() {
        return firstName;
    }
    public String getSecondName() {
        return secondName;
    }
    public Author getAuthor() {
        this.firstName = getFirstName();
        this.secondName = getSecondName();
        return this;
    }
    public Author writeAuthor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите имя автора: ");
        firstName = scanner.nextLine();
        System.out.println("введите фамилию автора: ");
        secondName = scanner.nextLine();
        return this;
    }
    public void printAuthor() {
        System.out.println("имя автора: " + firstName);
        System.out.println("фамилия автора: " + secondName);
    }
}
