package org.pinguinera.repositories;

import org.pinguinera.models.Book;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    private static BookRepository instance;
    private List<Book> books = new ArrayList<>();

    private BookRepository() {

    }

    public static BookRepository getInstance() {
        if (instance == null) {
            instance = new BookRepository();
        }

        return instance;
    }

    // CRUD: ADD - GET - UPDATE - DELETE

    public Book add(Book book) {
        books.add(book);
        return book;
    }

    public List<Book> get() {
        return books;
    }
}
