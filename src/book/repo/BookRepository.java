package book.repo;

import book.domain.Book;
import book.domain.exceptions.BookNotFoundCheckedException;
import book.domain.exceptions.BookNotFoundRuntimeException;

public interface BookRepository {
    Book findBook(String isbn) throws BookNotFoundRuntimeException, BookNotFoundCheckedException;
}
