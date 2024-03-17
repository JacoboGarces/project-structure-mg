package org.pinguinera.usecases.book;

import org.pinguinera.models.Book;
import org.pinguinera.repositories.BookRepository;
import org.pinguinera.usecases.IUseCase;

import java.util.List;

public class CreateBookUseCase implements IUseCase<Book> {
    @Override
    public Book execute(Book book) {
        BookRepository repository = BookRepository.getInstance();
        List<Book> books = repository.get();
        // Validas que el libro que se desea crear no exista en la lista
        return repository.add(book);
    }

    @Override
    public void adapt() {
        // Scanner

        Book result = execute(new Book("1", "1"));
    }
}
