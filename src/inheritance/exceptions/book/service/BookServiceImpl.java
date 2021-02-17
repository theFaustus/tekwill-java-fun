package inheritance.exceptions.book.service;

import inheritance.exceptions.book.domain.Book;
import inheritance.exceptions.book.domain.exceptions.BookNotFoundCheckedException;
import inheritance.exceptions.book.domain.exceptions.BookNotFoundRuntimeException;
import inheritance.exceptions.book.repo.BookRepository;

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
