package inheritance.exceptions.book.repo;

import inheritance.exceptions.book.domain.Book;
import inheritance.exceptions.book.domain.exceptions.BookNotFoundCheckedException;
import inheritance.exceptions.book.domain.exceptions.BookNotFoundRuntimeException;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class BookRepositoryImpl implements BookRepository {
    Set<Book> books = new HashSet<>(
            Arrays.asList(new Book("123456789", "nananana"), new Book("789456123", "lalalala")));

    @Override
    public Book findBook(String isbn) throws BookNotFoundRuntimeException, BookNotFoundCheckedException {
        Book foundBook = null;
        for (Book b : books) {
            if (b.getIsbn().equals(isbn))
                foundBook = b;
        }
        if (foundBook == null) {
//            throw new BookNotFoundRuntimeException("Book with isbn=" + isbn + " not found!"); runtime exception
            throw new BookNotFoundCheckedException("Book with isbn=" + isbn + " not found!");
        }
        return foundBook;
    }
}
