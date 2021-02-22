package book.service;

import book.domain.Book;
import book.domain.exceptions.BookNotFoundCheckedException;
import book.domain.exceptions.BookNotFoundRuntimeException;
import book.repo.BookRepository;

public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book getBookByIsbn(
            String isbn) throws BookNotFoundRuntimeException, NullPointerException, BookNotFoundCheckedException {
        return bookRepository.findBook(isbn);
    }
}
