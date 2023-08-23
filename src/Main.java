import homeworkk13.Book;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();

        System.out.println("ДАННЫЕ КНИГИ 1:");
        book1.writeBook();
        System.out.println("ДАННЫЕ КНИГИ 2:");
        book2.writeBook();

//        Scanner scanner = new Scanner(System.in);
//        int newYear;
//        System.out.println("введите новый год издания второй книги: ");
//        newYear = scanner.nextInt();
//        book2.setYear(newYear);
        System.out.println("ДАННЫЕ КНИГИ 1:");
        book1.printBook();
        System.out.println("ДАННЫЕ КНИГИ 2:");
        book2.printBook();

        if (book1.equals(book2)) {
            System.out.println("данные одинаковые");
        } else {
            System.out.println("данные различны");
        }
    }

}