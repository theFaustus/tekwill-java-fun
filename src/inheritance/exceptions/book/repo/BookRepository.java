package inheritance.exceptions.book.repo;

import inheritance.exceptions.book.domain.Book;
import inheritance.exceptions.book.domain.exceptions.BookNotFoundCheckedException;
import inheritance.exceptions.book.domain.exceptions.BookNotFoundRuntimeException;

public interface BookRepository {
    Book findBook(String isbn) throws BookNotFoundRuntimeException, BookNotFoundCheckedException;
}
