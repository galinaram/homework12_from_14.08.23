import homework12.Book;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();

        System.out.println("ДАННЫЕ КНИГИ 1:");
        book1.writeBook();
        System.out.println("ДАННЫЕ КНИГИ 2:");
        book2.writeBook();

        Scanner scanner = new Scanner(System.in);
        int newYear;
        System.out.println("введите новый год издания второй книги: ");
        newYear = scanner.nextInt();
        book2.setYear(newYear);
        System.out.println("ДАННЫЕ КНИГИ 1:");
        book1.printBook();
        System.out.println("ДАННЫЕ КНИГИ 2:");
        book2.printBook();

//        char c = 0;
//        do {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("1 - ввести данные двух книг");
//            System.out.println("2 - вывести записи на экран");
//            System.out.println("3 - изменить год");
//            System.out.println("0 - выход");
//            c = scanner.nextInt();
//            switch (c) {
//                case '1':
//                    System.out.println("ДАННЫЕ КНИГИ 1:");
//                    book1.writeBook();
//                    System.out.println("ДАННЫЕ КНИГИ 2:");
//                    book2.writeBook();
//                    return;
//                case '2':
//                    System.out.println("ДАННЫЕ КНИГИ 1:");
//                    book1.printBook();
//                    System.out.println("ДАННЫЕ КНИГИ 2:");
//                    book2.printBook();
//                    return;
//                case '3':
//                    int a = 0;
//                    System.out.println("1 - изменить год книги 1");
//                    System.out.println("2 - изменить год книги 2");
//                    a = scanner.nextInt();
//                    int newYear;
//                    if (a == 1) {
//                        System.out.println("введите новый год издания книги: ");
//                        newYear = scanner.nextInt();
//                        book1.setYear(newYear);
//                    } else if (a==2) {
//                        System.out.println("введите новый год издания книги: ");
//                        newYear = scanner.nextInt();
//                        book2.setYear(newYear);
//                    } else {
//                        System.out.println("такой книги нет");
//                    }
//                    return;
//            }
//
//
//        } while (c != '0');
    }
}