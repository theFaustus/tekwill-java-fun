package inheritance.exceptions.book.service;

import inheritance.exceptions.book.domain.Book;
import inheritance.exceptions.book.domain.exceptions.BookNotFoundCheckedException;
import inheritance.exceptions.book.domain.exceptions.BookNotFoundRuntimeException;

public interface BookService {
    Book getBookByIsbn(
            String isbn) throws BookNotFoundRuntimeException, NullPointerException, BookNotFoundCheckedException;
}
