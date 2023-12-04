package Exercises.Task4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws NoBookFoundException {

        BookRepository bookRepository = new BookRepository();

        Book book1 = new Book("123A","Art","James", 2022);
        Book book2 = new Book("123B","Mountain","John", 2021);
        Book book3 = new Book("123C","Habits","Anna", 2020);

        List<Book> books = new ArrayList<>();
        bookRepository.addBooks(book1);
        bookRepository.addBooks(book2);
        bookRepository.addBooks(book3);


        List<Book> booksByName = bookRepository.findByBookName("Art");
        System.out.println(booksByName);

        bookRepository.removeBook("123B");


        Book book4 = bookRepository.findBookById("123V");
        System.out.println(book4);



    }
}
