package book.service;

import book.domain.Book;
import book.repo.BookRepository;

import java.util.List;

public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book getBookByIsbn(String isbn) {
        return bookRepository.findBook(isbn);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public int updateBookNameByBookId(String newBookName, Long bookId) {
        return bookRepository.updateBookNameByBookId(newBookName, bookId);
    }

    @Override
    public int deleteBook(Long bookId) {
        return bookRepository.deleteBook(bookId);
    }

    @Override
    public int saveBook(Book book) {
        return bookRepository.saveBook(book);
    }
}
