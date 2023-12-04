package Exercises.Task4;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    private List<Book> books = new ArrayList<>();;


    public void addBooks(Book book) {
        this.books.add(book);
    }

    public void removeBook(String id) throws NoBookFoundException {

        for (Book book: books) {
            if (book.getId().equals(id)) {
                books.remove(book);
                return;
            }
        }
        throw new NoBookFoundException("Can't delete book with id " + id);
    }

    public List<Book> findByBookName(String name) throws NoBookFoundException {
        List<Book> booksByName = new ArrayList<>();
        for (Book book: books) {
            if (book.getTitle().equals(name)) {
                booksByName.add(book);
            }
        }
        if (booksByName.isEmpty()) {
            throw new NoBookFoundException("There is no book with this name on the list");
        }
        return booksByName;
    }

    public Book findBookById(String id) throws NoBookFoundException {
        for (Book book: books) {
            if (book.getId().equals(id)) {
                return book;
            }
        }
        throw new NoBookFoundException("There is no book with this id on the list");
    }

    public void removeBookByID(String id) {
        for (Book book : books) {
            if (book.getId().equals(id)) {
                books.remove(book);
            }
        }
    }

    @Override
    public String toString() {
        return "BookRepository{" +
                "books=" + books +
                '}';
    }
}
