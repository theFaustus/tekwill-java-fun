package book.service;

import book.domain.Book;
import book.domain.exceptions.BookNotFoundCheckedException;
import book.domain.exceptions.BookNotFoundRuntimeException;

public interface BookService {
    Book getBookByIsbn(
            String isbn) throws BookNotFoundRuntimeException, NullPointerException, BookNotFoundCheckedException;
}
